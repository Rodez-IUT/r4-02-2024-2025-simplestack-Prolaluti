package org.example;

import java.util.ArrayList;

public class SimpleStack implements Stack {

    private final ArrayList<Item> liste;

    public SimpleStack() {
    this.liste = new ArrayList<>();
    }

    /**
     * Tests if this stack is empty
     */
    @Override
    public boolean isEmpty() {
        return this.liste.size() == 0;
    }

    /**
     * Returns the number of items in this stack.
     */
    @Override
    public int getSize() {
        return this.liste.size();
    }

    /**
     * Pushes an item onto the top of this stack.
     * null item is allowed.
     *
     * @param item an item of the stack
     */
    @Override
    public void push(Item item) {
        this.liste.add(item);
    }

    /**
     * Looks at the object at the top of this stack without removing it from the stack.
     */
    @Override
    public Item peek() {
        return this.liste.get(getSize() - 1 );
    }

    /**
     * Removes the object at the top of this stack and returns
     * that object as the value of this function.
     *
     * @throws EmptyStackException if this stack is empty.
     */
    @Override
    public Item pop() throws EmptyStackException {
        if (this.getSize() == 0) {
            throw new EmptyStackException();
        }

        return this.liste.remove(this.getSize() - 1);
    }
}
