package com.michalsadel.twosum

import spock.lang.Timeout

import java.util.concurrent.TimeUnit

class TwoSumHashtable extends TwoSum {
    @Override
    Solution solution() {
        return new HashSolution()
    }
    @Timeout(value = 50, unit = TimeUnit.MILLISECONDS)
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