

class Solution{
class Inner
{
class Private
{
Private()
{
System.out.println("An instance of class: Solution.Inner.Private has been created");
}
Boolean powerOfTwo(int n)
{
if (n <= 0) 
{
return false;
}
int count = 0;
do {
if ((count += (n & 1)) > 1) {
return false;
}
}while ((n>>>=1) != 0);
return true;
}

}
}

public static void main(String args[])
{
Solution solution = new Solution();
Solution.Inner inner = solution.new Inner();
Inner.Private p = inner.new Private();

if(p.powerOfTwo(4))
{
System.out.println("yes");
}else{
System.out.println("No");
}
}
}