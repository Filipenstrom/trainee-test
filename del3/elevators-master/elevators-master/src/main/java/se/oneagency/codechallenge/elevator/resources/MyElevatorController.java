/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.oneagency.codechallenge.elevator.resources;
import java.util.List;
import se.oneagency.codechallenge.elevator.api.Elevator;
import  se.oneagency.codechallenge.elevator.api.ElevatorController;
import java.util.ArrayList;
/**
 *
 * @author filip
 */
public class MyElevatorController implements ElevatorController{
    
    private int maxFloor;
    private int maxElevators;
    final static private int minFloor = 1;
    List<MyElevator> elevatorsList = new ArrayList<MyElevator>();
    
    public MyElevatorController(int maxFloor, int maxElevators){
        this.maxFloor = maxFloor;
        this.maxElevators = maxElevators;
        
        for(int i = 1; i <= maxElevators; i++){
            elevatorsList.add(new MyElevator(i));
        }
    }
    
    public void moveElevatorToFloor(MyElevator elevator, int toFloor){
        
        
        if(toFloor > maxFloor){
            toFloor = maxFloor;
        }
        else if(toFloor < minFloor){
            toFloor = minFloor;
        }
        
        int currentFloor = elevator.currentFloor();
        
        while(currentFloor <= toFloor){
            System.out.println("Elevator " + elevator.getId() + " Floor: " + currentFloor);
            currentFloor++;
            
        }
        
        elevator.moveElevator(toFloor);
        
        
    }
    
   private MyElevator checkElevatorsInAction(List<MyElevator> list, int toFloor){
       
        List<MyElevator> elevatorsInAction = new ArrayList();
        MyElevator lift;
         
          for(MyElevator elevator : elevatorsInAction){
               if(elevator.currentFloor() == toFloor){
                   return elevator;
               }
             
     }
          return null;
   
   }
   
   private MyElevator checkElevatorDirectionAndBusyAndWorking(List<MyElevator> myList, int toFloor){
       
        List<MyElevator> list = new ArrayList();
        
         for(MyElevator elevator : list){
               if(elevator.isBusy() && !elevator.isMovingDown() && elevator.isWorking() && elevator.getAddressedFloor() < toFloor){
                   return elevator;
               }
               else if(elevator.isBusy() && elevator.isMovingDown() && elevator.isWorking() && elevator.getAddressedFloor() > toFloor){
                   return elevator;
               }
           }
         
         return null;
   }
   
   private MyElevator checkDifference(List<MyElevator> myList, int toFloor){
       
        List<MyElevator> list = new ArrayList();
         int difference = 0; 
         MyElevator lift = null;
         
        for(MyElevator elevator : list){
               if(elevator.isBusy()){
                   continue;
               }
               if(getDifference(toFloor, elevator.currentFloor()) < difference){
                   difference = getDifference(toFloor, elevator.currentFloor());
                   lift = elevator;
             
               }
           }
       return lift;
   }
    
   @Override
   public Elevator requestElevator(int toFloor){
        
       List<MyElevator> elevatorsInAction = new ArrayList();
       
       MyElevator closest = null;
      
       
       
       while(closest == null){
           
          MyElevator checker = checkElevatorsInAction(elevatorsInAction, toFloor);
          if(checker != null){
              checker.moveElevator(toFloor);
              return checker;
          }
           
         checker = checkElevatorDirectionAndBusyAndWorking(elevatorsInAction, toFloor);
         if(checker != null){
             checker.moveElevator(toFloor);
             return checker;
         }
         
         checker = checkDifference(elevatorsInAction, toFloor);
         if(checker != null){
             checker.moveElevator(toFloor);
             return checker;
         }
             
       }
       
       closest.moveElevator(toFloor);
       return closest;
    }
   
   private int getDifference(int floor1, int floor2){
       
       return Math.abs(floor1 - floor2);
   }

    /**
     * A snapshot list of all elevators in the system.
     *
     * @return A List with all {@link Elevator} objects.
     */
    @Override
   public List<Elevator> getElevators(){
       
       return new ArrayList<Elevator>(elevatorsList);
   }

    /**
     * Telling the controller that the given elevator is free for new
     * operations.
     *
     * @param elevator
     *            the elevator that shall be released.
     */
   @Override
   public void releaseElevator(Elevator elevator){
       for(MyElevator thisElevator : elevatorsList){
           if(elevator.getId() == thisElevator.getId()){
               thisElevator.setBusy(true);
           }
           
       }
   }
   
   public void openElevatorDoor(MyElevator elevator){
       elevator.setDoorStatus(true);
       System.out.println("Elevator " + elevator.getId() + " opened its doors!");
   }
   
   public void closeElevatorDoor(MyElevator elevator){
       elevator.setDoorStatus(false);
       System.out.println("Elevator " + elevator.getId() + " closed its doors!");
   }
}
