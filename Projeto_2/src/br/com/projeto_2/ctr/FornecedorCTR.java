package br.com.projeto_2.ctr;
import java.sql.ResultSet;
import br.com.projeto_2.dto.FornecedorDTO;
import br.com.projeto_2.dao.FornecedorDAO;
import br.com.projeto_2.dao.ConexaoDAO;

public class FornecedorCTR {
    
    FornecedorDAO fornecedorDAO = new FornecedorDAO();
    
    
    public FornecedorCTR(){
        
    }
    
    public String inserirFornecedor (FornecedorDTO fornecedorDTO){
        try{
            if (fornecedorDAO.inserirFornecedor(fornecedorDTO)){
                return "Fornecedor cadastrado com sucesso!!!";
            }else{
                return "Fornecedor não cadastrado!!!";
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            return "Fornecedor não cadastrado.";
        }
    }
    
    public ResultSet consultarFornecedor (FornecedorDTO fornecedorDTO, int opcao){
        
        ResultSet rs = null;
        
        rs = fornecedorDAO.consultarFornecedor(fornecedorDTO, opcao);
        return rs;
    }
    
    public String alterarFornecedor (FornecedorDTO fornecedorDTO){
        try{
            if (fornecedorDAO.alterarFornecedor(fornecedorDTO)){
                return "Fornecedor alterado com sucesso!!!";
            }else{
                return "Fornecedor não alterado!!!";
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            return "Fornecedor não alterado.";
        }
    }
    
     public String excluirFornecedor (FornecedorDTO fornecedorDTO){
        try{
            if (fornecedorDAO.excluirFornecedor(fornecedorDTO)){
                return "Fornecedor excluido com sucesso!!!";
            }else{
                return "Fornecedor não excluido!!!";
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            return "Fornecedor não excluido.";
        }
    }
    
     public void CLoseDB(){
         ConexaoDAO.CloseDB();
     }
     
}
