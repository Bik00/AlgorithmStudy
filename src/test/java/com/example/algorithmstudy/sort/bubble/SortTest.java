package com.example.algorithmstudy.sort.bubble;

import com.example.algorithmstudy.component.factory.start.ConstantBeanName;
import com.example.algorithmstudy.component.factory.start.StartSelector;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@DisplayName("정렬 전체 테스트")
class SortTest {

    @Autowired
    private StartSelector selector;

    @Test
    @DisplayName("버블 정렬 테스트")
    void BubbleSortTest() throws Exception {
        selector.select(ConstantBeanName.BUBBLE_SORT);
    }

    @Test
    @DisplayName("칵테일 정렬 테스트")
    void CocktailSortTest() throws Exception {
        selector.select(ConstantBeanName.MODIFIED_BUBBLE_SORT_COCKTAIL_SORT);
    }

    @Test
    @DisplayName("선택 정렬 테스트")
    void SelectionSortTest() throws Exception {
        selector.select(ConstantBeanName.SELECTION_SORT);
    }

    @Test
    @DisplayName("삽입 정렬 테스트")
    void InsertionSortTest() throws Exception {
        selector.select(ConstantBeanName.INSERTION_SORT);
    }

    @Test
    @DisplayName("병합 정렬/합병 정렬 테스트")
    void MergeSortTest() throws Exception {
        selector.select(ConstantBeanName.MERGE_SORT);
    }

    @Test
    @DisplayName("힙 정렬 테스트")
    void HeapSortTest() throws Exception {
        selector.select(ConstantBeanName.HEAP_SORT);
    }

    @Test
    @DisplayName("퀵 정렬 테스트")
    void QuickSortTest() throws Exception {
        selector.select(ConstantBeanName.QUICK_SORT);
    }

    @Test
    @DisplayName("트리 정렬 테스트")
    void TreeSortTest() throws Exception {
        selector.select(ConstantBeanName.TREE_SORT);
    }

    @Test
    @DisplayName("팀 정렬 테스트")
    void TimSortTest() throws Exception {
        selector.select(ConstantBeanName.TIM_SORT);
    }

    @Test
    @DisplayName("블록 병합 정렬 테스트")
    void BlockMergeSortTest() throws Exception {
        selector.select(ConstantBeanName.BLOCK_MERGE_SORT);
    }

    @Test
    @DisplayName("인트로 정렬 테스트")
    void IntroSortTest() throws Exception {
        selector.select(ConstantBeanName.INTRO_SORT);
    }

    @Test
    @DisplayName("기수 정렬 테스트")
    void RadixSortTest() throws Exception {
        selector.select(ConstantBeanName.RADIX_SORT);
    }

    @Test
    @DisplayName("카운팅 정렬 테스트")
    void CountingSortTest() throws Exception {
        selector.select(ConstantBeanName.COUNTING_SORT);
    }

    @Test
    @DisplayName("쉘 정렬 테스트")
    void ShellSortTest() throws Exception {
        selector.select(ConstantBeanName.SHELL_SORT);
    }

    @Test
    @DisplayName("보고 정렬 테스트")
    void BogoSortTest() throws Exception {
        selector.select(ConstantBeanName.BOGO_SORT);
    }

    @Test
    @DisplayName("보고보고 정렬 테스트")
    void BogobogoSortTest() throws Exception {
        selector.select(ConstantBeanName.BOGOBOGO_SORT);
    }

    @Test
    @DisplayName("대기 정렬 테스트")
    void SleepSortTest() throws Exception {
        selector.select(ConstantBeanName.SLEEP_SORT);
    }

    @Test
    @DisplayName("중력 정렬 테스트")
    void GravitySortTest() throws Exception {
        selector.select(ConstantBeanName.GRAVITY_SORT);
    }
}