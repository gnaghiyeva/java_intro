import java.util.Scanner;

public class sum_elements_without_loop {
    public static void main(String[] args) {
        long a1,a2,an,d,b1,b2,bm,k,Sn, Sm, n,m, S;
        Scanner sc = new Scanner(System.in);

        /*
        an=a1+(n-1)*d
        Sn = ((2*a1 + (n-1)*d)/2)*n;
         */

        System.out.print("1-ci silsilə üçün ilk həddi daxil edin: a1 = ");
        a1=sc.nextLong();

        System.out.print("1-ci silsilə üçün ikinci həddi daxil edin: a2 = ");
        a2=sc.nextLong();

        System.out.print("1-ci silsilə üçün n-ci həddi daxil edin: an = ");
        an=sc.nextLong();

        d = (a2-a1); //ədədi silsilənin fərqi
        n= ((an-a1)/d)+1;
        Sn = ((2*a1 + (n-1)*d)/2)*n; //ilk n həddin cəmi düsturu

        System.out.println("1-ci silsilə üçün ilk n həddin cəmi = " + Sn);

        /***************************************************************/

        System.out.print("2-ci silsilə üçün ilk həddi daxil edin: b1 = ");
        b1=sc.nextLong();

        System.out.print("2-ci silsilə üçün ikinci həddi daxil edin: b2 = ");
        b2=sc.nextLong();

        System.out.print("2-ci silsilə üçün m-ci həddi daxil edin: bm = ");
        bm=sc.nextLong();

        k = (b2-b1); //ədədi silsilənin fərqi
        m= ((bm-b1)/k)+1;
        Sm = ((2*b1 + (m-1)*k)/2)*m; //ilk n həddin cəmi düsturu

        System.out.println("2-ci silsilə üçün ilk m həddin cəmi = " + Sm);

        S = Sn + Sm;
        System.out.println("Ümumi cəm = "+ S);



    }
}
