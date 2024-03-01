public class point{
    int m_x,m_y;
    public point(int x,int y)
    {
         m_x=x;
         m_y=y;
    }
    public static void main(String[] args) {
        point p=new point(2,3);
        point p1=new point(2,4);
        System.out.println("X=============="+p.m_x);
        System.out.println("Y=============="+p.m_y);
        System.out.println("X=============="+p.m_x);
        System.out.println("Y=============="+p1.m_y);
        
    }
    
}
