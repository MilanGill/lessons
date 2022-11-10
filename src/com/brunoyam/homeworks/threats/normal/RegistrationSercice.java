package com.brunoyam.homeworks.threats.normal;

public class RegistrationSercice {



    public void registration(String login, String password, String confirmPassword){
        try {
            checkLoginAndPassword(login,password,confirmPassword);
        } catch (WrongLoginException | WrongPasswordException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Регистрация прошла успешно");
    }
    public void checkLoginAndPassword(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if(login.length() >= 16){
            throw new WrongLoginException("Логин должен содержать менее 16 символов");
        }
        if(password.length() >= 8 && !password.equals(confirmPassword)){
            throw new WrongPasswordException("Пароль должен содержать менее 8 символов. Необходимо подтвердить пароль");
        }
    }
}
