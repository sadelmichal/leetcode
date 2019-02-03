package com.michalsadel.twosum

class TwoSumNaive extends TwoSum {
    @Override
    Solution solution() {
        return new NaiveSolution()
    }

    def "when input array is huge then the time should not exceed 100ms"() {
        int size = 20_000
        given:
          int[] array = new int[size]
          array[size - 2] = 2
          array[size - 1] = 7
        when:
          def result = solution.twoSum(array, 9)
        then:
          result == [size - 2, size - 1]
    }

}