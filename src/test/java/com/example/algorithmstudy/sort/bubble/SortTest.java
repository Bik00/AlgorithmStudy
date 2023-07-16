package com.example.algorithmstudy.sort.bubble;

import com.example.algorithmstudy.component.factory.start.ConstantBeanName;
import com.example.algorithmstudy.component.factory.start.StartSelector;
import com.example.algorithmstudy.vo.request.InputRequest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootTest
@DisplayName("정렬 전체 테스트")
class SortTest {

    @Autowired
    private StartSelector selector;

    int size;
    int limitNumber;
    List<Integer> inputList;
    InputRequest request;
    @BeforeEach
    void setup() {
        size = 10;
        limitNumber = 99999; // 최대 9999 까지
        inputList = Stream.generate(() -> new Random().nextInt(limitNumber) + 1)
                .limit(size)
                .collect(Collectors.toList());
        request = InputRequest.builder()
                .request1(inputList)
                .build();
    }

    @Test
    @DisplayName("버블 정렬 테스트")
    void BubbleSortTest() throws Exception {
        selector.select(ConstantBeanName.BUBBLE_SORT, request);
    }

    @Test
    @DisplayName("칵테일 정렬 테스트")
    void CocktailSortTest() throws Exception {
        selector.select(ConstantBeanName.MODIFIED_BUBBLE_SORT_COCKTAIL_SORT, request);
    }

    @Test
    @DisplayName("선택 정렬 테스트")
    void SelectionSortTest() throws Exception {
        selector.select(ConstantBeanName.SELECTION_SORT, request);
    }

    @Test
    @DisplayName("삽입 정렬 테스트")
    void InsertionSortTest() throws Exception {
        selector.select(ConstantBeanName.INSERTION_SORT, request);
    }

    @Test
    @DisplayName("병합 정렬/합병 정렬 테스트")
    void MergeSortTest() throws Exception {
        selector.select(ConstantBeanName.MERGE_SORT, request);
    }

    @Test
    @DisplayName("힙 정렬 테스트")
    void HeapSortTest() throws Exception {
        selector.select(ConstantBeanName.HEAP_SORT, request);
    }

    @Test
    @DisplayName("퀵 정렬 테스트")
    void QuickSortTest() throws Exception {
        selector.select(ConstantBeanName.QUICK_SORT, request);
    }

    @Test
    @DisplayName("트리 정렬 테스트")
    void TreeSortTest() throws Exception {
        selector.select(ConstantBeanName.TREE_SORT, request);
    }

    @Test
    @DisplayName("팀 정렬 테스트")
    void TimSortTest() throws Exception {
        selector.select(ConstantBeanName.TIM_SORT, request);
    }

    @Test
    @DisplayName("블록 병합 정렬 테스트")
    void BlockMergeSortTest() throws Exception {
        selector.select(ConstantBeanName.BLOCK_MERGE_SORT, request);
    }

    @Test
    @DisplayName("인트로 정렬 테스트")
    void IntroSortTest() throws Exception {
        selector.select(ConstantBeanName.INTRO_SORT, request);
    }

    @Test
    @DisplayName("기수 정렬 테스트")
    void RadixSortTest() throws Exception {
        selector.select(ConstantBeanName.RADIX_SORT, request);
    }

    @Test
    @DisplayName("카운팅 정렬 테스트")
    void CountingSortTest() throws Exception {
        selector.select(ConstantBeanName.COUNTING_SORT, request);
    }

    @Test
    @DisplayName("쉘 정렬 테스트")
    void ShellSortTest() throws Exception {
        selector.select(ConstantBeanName.SHELL_SORT, request);
    }

    @Test
    @DisplayName("보고 정렬 테스트")
    void BogoSortTest() throws Exception {
        selector.select(ConstantBeanName.BOGO_SORT, request);
    }

    @Test
    @DisplayName("보고보고 정렬 테스트")
    void BogobogoSortTest() throws Exception {
        selector.select(ConstantBeanName.BOGOBOGO_SORT, request);
    }

    @Test
    @DisplayName("대기 정렬 테스트")
    void SleepSortTest() throws Exception {
        selector.select(ConstantBeanName.SLEEP_SORT, request);
    }

    @Test
    @DisplayName("중력 정렬 테스트")
    void GravitySortTest() throws Exception {
        selector.select(ConstantBeanName.GRAVITY_SORT, request);
    }
}