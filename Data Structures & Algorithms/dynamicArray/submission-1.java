class DynamicArray {

    private int capacity;
    private int size;
    private int data[];

    public DynamicArray(int capacity) {
       this.capacity = capacity;
       this.size = 0;
       this.data = new int[this.capacity];
    }

    public int get(int i) {
        return data[i];
    }

    public void set(int i, int n) {
         data[i] = n;
    }

    public void pushback(int n) {
        if (size < capacity) {
        data[size] = n;
        size++;
        }
        else {
            resize();
            data[size] = n;
            size++;
            }
        }
    

    public int popback() {
        if (size > 0){
            size--;
        }
        return data[size];
    }

    private void resize() {
        capacity *= 2;
        int[] newdata = new int[capacity];
            for (int i = 0; i < size; i++) {
                newdata[i] = data[i];
            }
            data = newdata;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }
}
