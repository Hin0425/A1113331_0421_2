import java.util.Scanner;

public class A1113331_0421_2 {
}

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("請輸入日期（YYYY/MM/DD 或 MM/DD/YYYY 的格式）：");
        String dateStr = input.nextLine();

        String[] dateArr = dateStr.split("/");
        int year = 0, month = 0, day = 0;

        if (dateArr.length == 3) {
            year = Integer.parseInt(dateArr[0]);
            month = Integer.parseInt(dateArr[1]);
            day = Integer.parseInt(dateArr[2]);
        } else if (dateArr.length == 2) {
            month = Integer.parseInt(dateArr[0]);
            day = Integer.parseInt(dateArr[1]);
            year = Integer.parseInt(dateArr[2]);
        } else {
            System.out.println("輸入的日期格式不正確！");
            return;
        }

        System.out.println("您輸入的日期為：" + year + "年" + month + "月" + day + "日");
    }
}
