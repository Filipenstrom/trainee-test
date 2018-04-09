/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.oneagency.codechallenge.elevator.resources;
import  se.oneagency.codechallenge.elevator.api.Elevator;


/**
 *
 * @author filip
 */
public class MyElevator implements Elevator{
    
    private int elevatorId;
    private int buildingFloor;
    private int finalFloor;
    private boolean busy = false;
    private boolean movingUp = false;
    private boolean works = true;
    private DirectionEnum direction;
    private boolean doorIsOpen = false;
  
    
    
  public MyElevator(int elevatorId){
      this.elevatorId = elevatorId;
  }
    
  @Override
  public DirectionEnum getDirection(){
        
    return direction;
  }
  
  public boolean isMovingDown(){
      if(direction == Elevator.DirectionEnum.DOWN && busy == true){
          return true;
      }
      
      return false;
  }

    
  @Override
  public int getAddressedFloor(){
        return finalFloor;
    }

  
  @Override
   public int getId(){
       return elevatorId;
   }

    
   @Override
  public void moveElevator(int toFloor){
     if(toFloor >= 1){
         finalFloor = toFloor;
     }
     System.out.println("There cannot be a floor lower than the first.");
  }

   
  @Override
   public boolean isBusy(){
        
        return busy;
    }
   
   
   public void setBusy(boolean busy){
       this.busy = busy;
   }

   
   @Override
    public int currentFloor(){
        return buildingFloor;
    }
    
    public void setDoorStatus(boolean doorIsOpen){
        this.doorIsOpen = doorIsOpen;
    }
    
    public boolean doorStatus(){
        return doorIsOpen;
    }
    
    public void setWorking(boolean works){
        this.works = works;
    }
    
    public boolean isWorking(){
        return works;
    }

}
