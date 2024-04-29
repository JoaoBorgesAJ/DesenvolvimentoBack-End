package br.com.cadUser;

import javax.faces.bean.*;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@SessionScoped
public class pessoa {
    private String nomeUsuario;
    private List<String> usuarios = new ArrayList<String>();
    private String email;
    private String senha;
    private String confirmarSenha;
    private boolean cadastrado;

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getConfirmarSenha() {
        return confirmarSenha;
    }

    public void setConfirmarSenha(String confirmarSenha) {
        this.confirmarSenha = confirmarSenha;
    }

    public boolean isCadastrado() {
        return cadastrado;
    }

    public void setCadastrado(boolean cadastrado) {
        this.cadastrado = cadastrado;
    }

    public String cadastrarUsuario() {
        usuarios.add(nomeUsuario);

        this.nomeUsuario = "";
        this.email = "";
        this.senha = "";
        this.confirmarSenha = "";
        this.cadastrado = true; 
        
        return "index";
    }
}
