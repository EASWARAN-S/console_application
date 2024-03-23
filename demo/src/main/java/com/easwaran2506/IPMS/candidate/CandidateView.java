package com.easwaran2506.IPMS.candidate;

import java.util.Scanner;

import com.easwaran2506.IPMS.login.LoginView;
import com.easwaran2506.IPMS.welcomeScreen.WelcomeScreenView;

public class CandidateView {
    Scanner sc = new Scanner(System.in);
    private LoginView loginView = new LoginView();
    private WelcomeScreenView welcomeScreenView = new WelcomeScreenView();

    public void init(int userType) {
        if (userType == 4) {
            applyInterview();
        }
    }

    private void applyInterview() {
        System.out.println("Choose the company you want to  ");
    }

    private void mainMenu() {

    }

}
