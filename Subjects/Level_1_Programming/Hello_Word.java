class Professor{
    public String nome;
    public String email;
    public int cargaHoraria;
    public double salario;
    public String titulacao;
    
        public String exibirProfessor(){
            return nome + "\n" + "E-mail: " + email + "\n" + "Carga: " + cargaHoraria + "\n"  + "Salario: " + salario + "\n" + "Titulacao: " + titulacao + "\n" ;
        }
}

class Faculdade{
    public static void main(String args[]){
        Professor professorUm = new Professor();
        professorUm.nome = "Pablo";
        professorUm.email = "pablo.polito@totvs.com.br";
        professorUm.cargaHoraria = 30;
        professorUm.salario = 10000;
        professorUm.titulacao = "Professor";
        System.out.println("Docente: " + professorUm.exibirProfessor());
    }
}