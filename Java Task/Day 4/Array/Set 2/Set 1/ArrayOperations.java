class ArrayOperations
{
static Boolean traverse(int[] array, int element){
for(int i = 0;i<array.length;i++){
if(array[i] == element){
return true;
}
}
return false;
}

static void oddElements(int[] array){
System.out.println("Odd elements of array : ");
for(int i =0;i<array.length;i+=2){
System.out.print(array[i]+" ");
}
System.out.println();
}


static void evenElements(int[] array){
System.out.println("Even elements of array : ");
for(int i =1;i<array.length;i+=2){
System.out.print(array[i]+" ");
}
System.out.println();
}

static void reverse(int[] array){
int i =0;
int j = array.length - 1;
while(i<j){
array[i] = array[i]^array[j];
array[j] = array[i]^array[j];
array[i] = array[i]^array[j];
i++;
j--;
}
}


static int[] insert(int[] array, int element, int index){
int[] a = new int[array.length+1];
if(index>array.length-1){
System.out.println("Can't insert at the given index");
return array;
}
for(int i =0;i<index;i++){
a[i] = array[i];
}
a[index] = element;
for(int i = index+1;i<=array.length;i++)
{
a[i] = array[i-1];
}
return a;
}
public static void main(String args[]){
int[] array = {1,2,3,4,5,6,7,8,9};
int element = 3;
if(traverse(array,element)){
System.out.println("Element exist");
}else{
System.out.println("Element does not exist");
}
oddElements(array);
evenElements(array);
reverse(array);
System.out.println("After reversing the array");
for(int i:array){
System.out.print(i+" ");
}
System.out.println();
reverse(array);
array = insert(array,3,4);
for(int i:array){
System.out.print(i+" ");
}
System.out.println();
}

}