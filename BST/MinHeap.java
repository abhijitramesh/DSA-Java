public class MinHeap {
	
private int [] Heap;
int maxsize;
int size;

private static final int  FRONT = 1;

public MinHeap(int maxsize) {
	this.maxsize = maxsize;

	this.size = 0;
	this.Heap = new int[maxsize +1];
	Heap[0]= Integer.MIN_VALUE;
}

private int parent(int pos) {
	return pos/2;
}

private int leftChild(int pos) {
	return 2*pos;
}
private int rightChild(int pos) {
	return (2*pos)+1;
}
private boolean isLeaf(int pos) {
	if(pos >=(size/2) || pos < size) {
		return true;
	}
		return false;
}
private void swap(int fpos,int spos) {
	int temp = Heap[fpos];
	Heap[fpos] = Heap[spos];
	Heap[spos] = temp;
}

private void minHeapify(int pos) {
	if(!isLeaf(pos)) {
		if(Heap[pos]>Heap[leftChild(pos)]|| Heap[pos]>Heap[rightChild(pos)]) {
			if(Heap[leftChild(pos)]<Heap[rightChild(pos)]) {
				swap(pos,leftChild(pos));
				minHeapify(leftChild(pos));
			}
			else {
				swap(pos,rightChild(pos));
				minHeapify(rightChild(pos));
			}
		}
	}
}

public void insert(int data) {
	if(size >= maxsize) {return;}
	Heap[++size]= data;
	int current = size;
	while(Heap[current]<Heap[parent(current)]) {
		swap(current,parent(current));
		current = parent(current);
	}
}

public void print() {
	for(int i=1;i<=size/2;i++) {
		System.out.println("Parent = "+Heap[i]+" Left Child = "+Heap[2*i]+" Right Child = "+Heap[(2*i)+1]);
		System.out.println();
	}
}

public void minHeap() {
	for(int i =(size/2);i>=1;i--) {
		minHeapify(i);
	}
}

public int pop() {
	int poped = Heap[FRONT];
	Heap[FRONT] = Heap[size--];
	minHeapify(FRONT);
	
	return poped;
}







}


