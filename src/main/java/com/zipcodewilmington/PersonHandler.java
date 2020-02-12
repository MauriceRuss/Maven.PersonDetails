package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {
        String result = "";
        int counter = 0;
        while(counter < personArray.length){
            String stringRepresentation = "";
            stringRepresentation += "\n" + "My first name is " + personArray[counter].getFirstName();
            stringRepresentation += "\n" + "My last name is " + personArray[counter].getLastName();
            result += stringRepresentation;
            counter++;
        }
        return result;
        // create a `counter`
        // while `counter` is less than length of array
            // begin loop

                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable

            // end loop


    }



    public String forLoop() {
        String result = "";
        for( int q = 0; q < personArray.length; q++) {
            result += personArray[q];
        }

        /*int value = 0;
        int value = 0;
        int increment = 0;
        int counter = 0;
        for(counter )*/
        // identify initial value
        // identify terminal condition
        // identify increment

        // use the above clauses to declare for-loop signature
            // begin loop
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop


        return result;
    }



    public String forEachLoop() {
        String result = "";

        for(Person s: personArray) {
            result += s;
        }

        // identify array's type
        // identify array's variable-name

        // use the above discoveries to declare for-each-loop signature
            // begin loop
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
