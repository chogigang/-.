package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class _01 {
    String[] strArr = {"dd", "aaa", "CC", "cc", "b"};
    Stream<String> stream = Stream.of(strArr); // 문자열 배열이 소스인 스트림
    Stream<String> filteredStream = stream.filter(); // 걸러내기(중간 연산)
    Stream<String> distinctedStream = stream.distinct(); // 중복 제거(중간 연산)
    Stream<String> sortedStream = stream.sort(); // 정렬 (중간 연산)
    Stream<String> limitedStream = stream.limit(5); // 스트림 자르기 (중간 연산)
   // int total = stream.count(); // 요소 개수 세기 (최종 연산) - 스트림 닫힘 closed




    Stream<T> Collection.stream()

    // List로부터 스트림 생성
    List<Integer> list = Arrays.asList(1,2,3,4,5);
    Stream<Integer> intStream = list.stream();  // list를 소스로 하는 컬렉션 생성



    //스트림 배열

    Stream<T> Stream.of(T... values)  // 가변 인자
    Stream<T> Stream.of(T[])
    Stream<T> Arrays.stream(T[])
    Stream<T> Arrays.stream(T[] array, int startInclusive, int endExclusive)
    // 문자열 스트림 생성
    Stream<String> strStream = Stream.of("a","b","c"); // 가변인자
    Stream<String> strStream = Stream.of(new String[]{"a","b","c"});
    Stream<String> strStream = Arrays.stream(new String[]{"a","b","c"});
    Stream<String> strStream = Arrays.stream(new String[]{"a","b","c"}, 0, 3);
    // int, long, double과 같은 기본형 배열을 소스로 하는 스트림 생성
    IntStream IntStream.of(int...values)
    IntStream IntStream.of(int[])
    IntStream Arrays.stream(int[])
    IntStream Arrays.stream(int[] array, int startInclusive, endExclusive)

        intStream Array.stream(int[] array, int startInclusive, endExclusive)





}
