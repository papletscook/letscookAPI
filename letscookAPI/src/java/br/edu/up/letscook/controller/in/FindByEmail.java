/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.up.letscook.controller.in;

/**
 *
 * @author G0042204
 */
public class FindByEmail {

    private String email;

    public FindByEmail() {
    }

    public FindByEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
