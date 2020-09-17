class Express{
    public static void main(String args[]) {
        int x=10;
        int y;
        int z;
        y = x*x + 3*x - 7;
        System.out.println(y);

        y = x++ + ++x;
        System.out.println("x = "+x+" y = "+y);

        z = x++ - --y - --x  +  x++;
        System.out.println("x = "+x+" y = "+y+ " z = "+z);

        boolean p = true;
        boolean q = false;
        boolean r;
        r = p && q || (!(p || q));
        System.out.println("p = "+p+" q = "+q+ " z = "+r);


    }

}