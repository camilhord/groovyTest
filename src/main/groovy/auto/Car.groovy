package auto

/**
 * Created by camilhord on 3/6/14.
 */
class Car {
    String make

    Car (Map map = [:]){
        map?.each {k,v -> this[k]= v}

        validateMakeIsInApprovedList()
    }

        def validateMakeIsInApprovedList(){
            List approvedMakes = Thread.currentThread().getContextClassLoader().getResource('approvedMakeList.txt').readLines()
            if (!approvedMakes.contains(make)){
                throw new RuntimeException("Error: $make = is not in the approved list")
        }
    }
}