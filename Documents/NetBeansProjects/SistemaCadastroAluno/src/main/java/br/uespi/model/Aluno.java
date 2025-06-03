/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.uespi.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;
/**
 *
 * @author Hassan Zeidam && Filipe Gênesis
 */
public class Aluno {
    private String matricula;
    private String nome; 
    
    private LocalDate dataNascimento;
    private String telefone;
    private String cpf;
    
    
    public Aluno(){} 
    
    public Aluno(String matricula, String nome , LocalDate dataNascimento, String telefone , String cpf){
        this.matricula = matricula;
        this.nome = nome;
        
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.cpf = cpf;
    } 
    
    public String getMatricula(){return matricula;}
    public void setMatricula(String matricula){this.matricula = matricula;} 
    
    public String getNome(){return nome;}
    public void setNome(String nome){this.nome = nome;}
    
    public int getIdade(){
         if(dataNascimento == null){
             return 0;
         }
         
         return Period.between(dataNascimento, LocalDate.now()).getYears();
    
    } 
    
    
    public LocalDate getDataNascimento(){return dataNascimento;}
    public void setDataNascimento(LocalDate dataNascimento){this.dataNascimento = dataNascimento;}
    
    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }
    
    @Override 
    public String toString(){
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return matricula + "," + nome + ";" + getIdade() + ";" + dataNascimento.format(formato) + ";" + telefone + ";" + cpf; 
        
    }
    
    
}
