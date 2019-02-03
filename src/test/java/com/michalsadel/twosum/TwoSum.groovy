package com.michalsadel.twosum

import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll

abstract class TwoSum extends Specification {
    abstract Solution solution();

    @Shared
            solution = solution()

    @Unroll
    def "for given #array indices are #index1, #index2"() {
        expect:
          solution.twoSum(array, target) == [index1, index2]
        and:
          array[index1] + array[index2] == target
        where:
          array                   | target | index1 | index2
          [2, 7, 11, 15] as int[] | 9      | 0      | 1
          [3, 2, 4] as int[]      | 6      | 1      | 2
    }

    def "when input array is null then the result should be null as well"() {
        given:
          int[] array = null
        when:
          def result = solution.twoSum(array, 5)
        then:
          result == null
    }

}