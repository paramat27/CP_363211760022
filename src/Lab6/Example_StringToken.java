package Lab6;

import java.util.StringTokenizer;

public class Example_StringToken {
    public static void main(String[] args) {

        StringBuffer str = new StringBuffer("วิกิพีเดีย ได้รับการยอมรับว่าเป็น \"สารานุกรมระบบเปิด\" ที่มีสาระความรู้ที่ยอมรับได้ และได้รับการจัดทำเป็นภาษาต่างๆ มากกว่า 20 ภาษา รวมทั้งภาษาไทย ด้วยคุณลักษณะที่เป็นระบบเปิด" +
                " ส่งผลให้หน่วยงานจำนวนมากต้องการนำเสนอเนื้อหาที่เกี่ยวข้องกับตนเอง ผลงานของหน่วยงานเผยแพร่ผ่านวิกิพีเดีย และหลายๆ คร้งผู้เขียนก็ต้องพบกับความผิดหวัง" +
                " เพราะเนื้อหาที่เขียนลงไปนั้น ถูกขึ้นป้ายว่า \"ไม่ถูกต้อง\" หรือ \"ควรปรับปรุง\" หรือร้ายยิ่งกว่า คือ ถูกลบออกจากระบบ โดยผู้ดูแลวิกิพีเดีย");
        StringTokenizer strToken = new StringTokenizer(str.toString());
        int countWord = strToken.countTokens();
        System.out.println("Word count"+countWord);

        while (strToken.hasMoreTokens()){
            System.out.println(strToken.nextToken());
        }


    }
}
