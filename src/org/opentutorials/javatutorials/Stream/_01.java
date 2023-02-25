package Stream;

import java.util.stream.Stream;

public class _01 {
    String[] strArr = {"dd", "aaa", "CC", "cc", "b"};
    Stream<String> stream = Stream.of(strArr); // 문자열 배열이 소스인 스트림
    Stream<String> filteredStream = stream.filter(); // 걸러내기(중간 연산)
    Stream<String> distinctedStream = stream.distinct(); // 중복 제거(중간 연산)
    Stream<String> sortedStream = stream.sort(); // 정렬 (중간 연산)
    Stream<String> limitedStream = stream.limit(5); // 스트림 자르기 (중간 연산)
   // int total = stream.count(); // 요소 개수 세기 (최종 연산) - 스트림 닫힘 closed

}
