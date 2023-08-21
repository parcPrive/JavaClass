import java.util.Arrays;

public class StringTest {
  public static void main(String[] args) {
    //거의 String
    String a = new String("  java");
    String b = new String(",  Spring ");
    System.out.println(a.length());
    System.out.println(a.contains("ja")); // contains 문자열안에 내가 찾고자 하는 문자열이 있는지 확인해서 true false을 뱉는다.
    System.out.println(a.concat(b)); //
    a = a.trim();
    b = b.trim();
    System.out.println(a.concat(b));

    String c = "  2 ";
    String d = "\t\n";
    System.out.println(c.trim().isEmpty()); //isEmpty는 문자열의 길이가 0인지 아닌지 확인하는것이다. 길이가 0이면 true 길이가 0이 아니면 false가 된다.
    System.out.println(c.trim().length()); //trim은 양쪽 공백만 지워준다.
    System.out.println(c.isBlank()); // isBlank는 문자열의 공백을 제가한다음 길이가 0인지 아닌지 비교
   
    // String c = a.concat(b);
    // String d = a + b;
    // System.out.println(c.equals(d));

    String e = "피곤한 월요일 월요일";
    System.out.println(e.charAt(2));
    System.out.println(e.indexOf("월")); // 일치하는 글자의 인덱스 번호를 알려준다. 일치하는 글자가 없다면 -1 그리고 연속된 글자들이 있어도 맨처음 글자의 인덱스만 반환한다. 
    System.out.println(e.lastIndexOf("월")); // lastIndexOf는 문자열의 맨뒤에서 일치하는 글자의 인덱스를 반환한다.

    String f = "hello java";
    String g = "HELLO JAVA";
    System.out.println(f.equals(g));
    System.out.println(f.equalsIgnoreCase(g)); // 대소문자 비교? 두개의 문자열의 대소문자가 다르지만 문자열을 비교해서 같으지 아닌지 확인해준다. return타입은 boolean이다.
    // System.out.println(f.equals(g.toLowerCase()));
    
    String str03 = "점";
    System.out.println(str03.concat("심"));
    String str04 = str03 + "심";

    // StringBuilder str05 = new StringBuilder("a");
    String str05 = new StringBuilder("a").append("b").append("c").toString();
    System.out.println(str05);

    String str06 = "꿍짝";
    String str06Copy = str06.concat("꿍짝").concat("꿍짝").concat("꿍짝");
    System.out.println(str06Copy);
    String str06Repeat = str06.repeat(4); //repeat(x) x만큼 반복한다.
    System.out.println(str06Repeat); //쿵짝 쿵짝 쿵짝 쿵짝

    System.out.println(str06.concat(" ").repeat(4).trim());

    String story = "아주 아주 먼 옛날 인어공주가 바다속에서 광어를 회쳐 먹고 살았습니다.";

    System.out.println(story.startsWith("아주")); // 문자열의 시작하는 문자들과 같은지 비교한다.
    System.out.println(story.endsWith("살았습니다.")); // 마지막에 들어가있는 문자들과 같은지 비교한다.

    String str07 = "쥐를 잡자 개를 잡자 양도 잡자 돼지도 잡자 쥐를 잡자 찍찍찍";
    // System.out.println(str07.replace("쥐","개"));
    System.out.println(str07.replaceAll("[쥐,개,양,돼지]", "소"));

    String str08 = "java, c#, spring, python, javascript";
    // System.out.println(str08.split("").toString());
    String array[] = str08.split(", "); // split(x) x 안에 ""이걸 넣으면 "java"일 경우 ["j", "a", "v", "a"]가 출력된다.
    System.out.println(Arrays.toString(array));

    String arrayText = String.join(" ", array); // join은 배열을 문자열로 바꿀수있다.
    System.out.println(arrayText);

    String str09 = "안녕하세요. 점심 맛있게 먹었나요?";
    System.out.println(str09.substring(2,7)); //글자 자르ㄸㄸㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇㅇ기ㄹㄹ


    // String aa = new String
  }
  
}
