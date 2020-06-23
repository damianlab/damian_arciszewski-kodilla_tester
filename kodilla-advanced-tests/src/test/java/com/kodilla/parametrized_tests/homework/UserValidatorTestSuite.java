package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class UserValidatorTestSuite {

private UserValidator userValidator = new UserValidator();

@ParameterizedTest
@ValueSource(strings = {"dai" , "A04." , "3_C56"})
public void shouldReturnTrueIfUsernameContainsMoreThenThreeCharacters (String username) {
    boolean result = userValidator.validateUsername(username);
    assertTrue(result);
}

@ParameterizedTest
@ValueSource(strings = {"%^!er" , "rs&(" , "@#%@"})
public void shouldReturnFalseIfUsernameContainsNotAllowedCharacters (String  username) {
    boolean result = userValidator.validateUsername(username);
    assertFalse(result);
}

@ParameterizedTest
@ValueSource(strings = {"Da" , "4W" , "0"})
public void shouldReturnFalseIfUsernameIsLessThanThreeCharacters (String username) {
    boolean result = userValidator.validateUsername(username);
    assertFalse(result);
}

@ParameterizedTest
@NullSource
    public void shouldThrowNullPointerExceptionWhenUsernameIsNull (String username) {
    assertThrows(NullPointerException.class, () -> { userValidator.validateUsername(username); } );
}
@ParameterizedTest
@EmptySource
    public void shouldReturnFalseIfUsernameIsEmpty (String username) {
    assertFalse(userValidator.validateUsername(username));
}

@ParameterizedTest
@ValueSource(strings = {"drtg.adt@gmail.com" ,"adam21@onet.pl" , "23aw15@flex.com"})
public void shouldReturnTrueIfValidateEmailContainsCorrectValue (String email) {
    boolean result = userValidator.validateEmail(email);
    assertTrue(result);
}
@ParameterizedTest
@ValueSource(strings = {"źcd45@gmail.com" ,"adam21@onet" , "23aw15flex.com" , " "})
public void shouldReturnFalseIfValidateEmailContainsNotAllowedValue (String email) {
    boolean result = userValidator.validateEmail(email);
    assertFalse(result);
}

@ParameterizedTest
@NullSource
public void shouldReturnFalseWhenValidateEmailIsNull (String email) {
    assertFalse(userValidator.validateEmail(email));
}

@ParameterizedTest
@EmptySource
public void shouldReturnTrueWhenValidateEmailIsEmpty (String email) {
    assertTrue(userValidator.validateEmail(email));
}

}