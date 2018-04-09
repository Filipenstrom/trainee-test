Det största problemet med denna kod är att den är statisk. 
Det hade varit bättre att skriva en mer dynamisk kod.
Detta kan ändras genom att skapa en metod som skapar en ny array med optimalt med plats och denna metod kan användas på flera ställen i klassen.


package se.oneagency.trainee.part2;

import java.util.Arrays;

public class VeryBasicStack  {

    private int stackPointer;
    private Object[] data;
   


    //Arrayens storlek sätts. Det hade varit bättre med en dynamisk lösning då arrayen tar upp onödigt mycket minne.
    //Man skulle även kunna sätta en lägre storlek på arrayen (en default size), exempelvis 10, för att sedan skapa en ny array vid behov.
    //Arrayens namn skulle kunna ha ett bättre namn dessutom t.ex. container
    
    public VeryBasicStack() {
        data = (Object[]) new Object[1000];
        stackPointer = 0;
    }

    //Här bör man kontrollera värdet på stackpointern och kolla om den faller inom arrayens längd.
    // Är den inte det skulle det vara bra att använda en metod som omstrukturerar arrayen så den får optimalt med plats (varken för mycket / för lite)

    public VeryBasicStack push(Object newItem){
        data[stackPointer] = newItem;
        stackPointer++;
        return this;
    }

   
    //Här bör man kontrollera värdet på stackpointern. if(stackPointer == -1) och sedan hanterar man felet - ev med exception
    //Här skulle man även kunna förminska arrayen om det skulle finnas för många oanvända platser - 
    //Detta skulle kunna lösas genom att skapa en metod som omstrukturerar arrayen så den får optimalt med plats (varken för mycket / för lite)

    public Object pop(){
        stackPointer--;
        return data[stackPointer];

    }

   
   //Kanske köra en for-loop istället för find first
   //Åtminstone mer läsbart med en loop / kanske sämre prestanda?

    public boolean contains(Object item){

        Object o = Arrays.stream(data).filter(x -> item.equals(x)).findFirst();

        return o != null;
    }

   
    public Object access(Object oneItem){
        while(stackPointer > 0){
            Object tmpItem = pop();
            if(oneItem.equals(tmpItem)){
                return tmpItem;
            }
        }
        throw new IllegalArgumentException("Could not find the item on the stack:" + oneItem);

    }




}