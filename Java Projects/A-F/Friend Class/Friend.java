
public class Friend
{
    public String name;
    public int age;
    public Friend nextFriend;
    public Friend(String n, int a, Friend ptr)
    {   
        name = n;
        age = a;
        nextFriend = ptr; 
    }
}
