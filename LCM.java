class LCM {
    static int GCD(int u, int v){
        if (u==0)
            return v;
        return GCD(v%u,u);
    }
    static int leastcm(int u, int v){
        
        return ((u/GCD(u,v))*v);
    }
public static void main(String[] args){
    int u =25,v=15;
    System.out.println("lcm is:"+ leastcm(u,v));

    }    
}
