package io.zipcoder;

/**
 * Modify the run function so that the monkeys each grab the next word and write it to the copy.
 */
public class UnsafeCopier extends Copier implements Runnable {
    
    public UnsafeCopier(String toCopy) {
        super(toCopy);
    }
    
    public void run() {
        while (stringIterator.hasNext()) {
            if (System.currentTimeMillis() % (3|11) == 0) {
                copiedText += " Stupid Monkey! " + stringIterator.next() + " ";
            } else {
                copiedText += stringIterator.next() + " ";
            }
            
        }
    }
}
