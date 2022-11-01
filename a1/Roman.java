public class Roman {
    public static int romanToInt(String romanNum) {
        int decimal = 0;
        int num = 0;
        int prevnum = 0;
        for (int i = romanNum.length() - 1; i >= 0; i--) {
            switch (romanNum.charAt(i)) {
                case 'I':
                    prevnum = num;
                    num = 1;
                    break;
                case 'V':
                    prevnum = num;
                    num = 5;
                    break;
                case 'X':
                    prevnum = num;
                    num = 10;
                    break;
                case 'L':
                    prevnum = num;
                    num = 50;
                    break;
                case 'C':
                    prevnum = num;
                    num = 100;
                    break;
                case 'D':
                    prevnum = num;
                    num = 500;
                    break;
                case 'M':
                    prevnum = num;
                    num = 1000;
                    break;
            }
            if (num < prevnum) {
                decimal -= num;
            } else {
                decimal += num;
            }
        }
        return decimal;
    }
}
