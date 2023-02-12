public class List<T> {
    private T[] array;
    private int cap;
    private int index = 0;
    public List() {
        this.cap = 10;
        this.array = (T[]) new Object[this.cap];
    }
    public List(int cap) {
        if (cap > 0) {
            this.cap = cap;
        } else {
            this.cap = 10;
        }
        this.array = (T[]) new Object[this.cap];
    }
    public int size() {
        return this.getIndex();
    }
    public void add(T data) {
        if (this.getIndex() == this.getCap()) {
            this.setCap(this.getCap() * 2);

            T[] tempArray = (T[]) new Object[this.getCap()];

            int i = 0;
            for (T arr : this.getArray()) {
                tempArray[i] = arr;
                i++;
            }
            this.setArray(tempArray);
        }
        this.setArray(this.getIndex(),data);
        this.setIndex(this.getIndex() + 1);
    }

    private void setCap(int i) {
    }

    public T get(int index) {
        if (this.getIndex() > index) {
            return this.getArray()[index];
        }
        return null;
    }

    public T remove(int index) {
        if (this.getIndex() > index) {
            T deletedValue = this.getArray()[index];
            for (int i = index; i < this.getIndex(); i++) {
                this.setArray(i,this.getArray()[i+1]);
            }
            this.setArray(size(),null);
            this.setIndex(this.getIndex() - 1);
            return deletedValue;
        }
        return null;
    }

    public T set(int index, T data) {
        if (this.getIndex() > index) {
            this.setArray(index,data);
            return this.getArray()[index];
        }
        return null;
    }

    
    public static String toString() {
        String listArray = "[";
        for (int i = 0; i < size(); i++) {
            listArray += (this.getArray()[i].toString());
            if (i != size() - 1) {
                listArray += " ";
            }
        }
        listArray += "]";
        return listArray;
    }

    public int indexOf(T data) {
        for (int i = 0; i < this.getIndex(); i++) {
            if (this.getArray()[i] == data) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(T data) {
        for (int i = this.getIndex() - 1; i >= 0; i--) {
            if (this.getArray()[i] == data)
                return i;
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.getIndex() == 0;
    }

    public T[] toArray() {
        return this.getArray();
    }

    public void clear() {
        this.setIndex(0);
        this.setCapacity(10);
        this.setArray((T[]) new Object[this.cap]);
    }
    public List<T> subList(int start, int finish) {
        List<T> subList = new List<>(finish - start + 1);

        for (int i = start; i <= finish; i++) {
            subList.add(this.getArray()[i]);
        }

        return subList;
    }

    public boolean contains(T data) {
        return indexOf(data) != -1;
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public void setArray(int index, T data){
        this.array[index] = data;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        if (index >= 0) {
            this.index = index;
        } else {
            this.index = this.getIndex();
        }
    }public int getCap() {
        return cap;
    }public void setCapacity(int cap) {
        if (cap >= 0) {
            this.cap = cap;
        }
    }
}
