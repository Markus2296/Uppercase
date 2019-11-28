package de.hfu;

import org.junit.Test;
import static org.junit.Assert.*;

public class QueueTest {

    @Test
    public void TestEnqueue(){

    }

    @Test
    public void TestDequeue(){
        try {
            Queue queue = new Queue(0);
            fail("Falsche Queue Größe!!");

        }catch(IllegalArgumentException e){ }

        Queue queue = new Queue(3);
        try{
            queue.dequeue();
            fail("Nich möglich aus einer leeren Watreschlange ein Elemnt rasuzunehem");
        }catch(IllegalStateException e){}


        for(int i = 1; i<= 4; ++i){
            queue.enqueue(i);
        }

        assertEquals("Sind nicht gleich", 1, queue.dequeue());


    }
}
