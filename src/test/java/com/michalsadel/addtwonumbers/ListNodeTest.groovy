package com.michalsadel.addtwonumbers

import spock.lang.Shared
import spock.lang.Specification
import spock.lang.Unroll

class ListNodeTest extends Specification {
    @Shared
    Solution solution = new Solution()

    @Unroll
    def "should two non empty linked list with non negative single digit in the node and stored in reversed order produce a new linked list as a sum of its components"() {
        given:
          def list1 = new ListNode(2)
          list1
                  .append(4)
                  .append(3)
        and:
          def list2 = new ListNode(5)
          list2
                  .append(6)
                  .append(4)

        when:
          def result = solution.addTwoNumbers(list1, list2)
        then:
          result != null
          result.toString() == "7,0,8"
          result.getListValue() == 807
    }
}
