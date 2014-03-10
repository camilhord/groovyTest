package auto

import auto.Car

/**
 * Created by camilhord on 3/6/14.
 */
class ShouldGetManufacturer extends GroovyTestCase{

    void testPropertyIsNotNull(){
        assert new Car(make: 'Ford').make != null
    }

    void testManufacturerIsSetCorrectly(){
        assert new Car(make: 'Honda').make == 'Honda'
    }

    void testManufacturerPropertyIsEmptyWhenLeftBlank(){
        shouldFail {new Car(make: '').make == ''}
    }

    void testSettingManufacturerPropertyOutsideConstructor(){
        Car myCarClass = new Car(make: 'Honda')
        myCarClass.setMake('Ford')
        assert myCarClass.getMake() == 'Ford'
    }

    void testShouldThrowExceptionWhenMakeIsToyota(){
        shouldFail {new Car(make: 'Toyota').validateMakeIsInApprovedList()}
    }
}
