import java.util.Random;
public class TestandoForEach {
	public static void main(String[] args) {
		System.out.println("Bem vindo ao programa de exercício de ForEach! Iremos exercitar a estrutura forreach em um vetor de notas em uma turma de alunos!");
		System.out.println("Criando turma de alunos...");
		int notas[] = new int[20];
		System.out.println("A turma de alunos foi criada! Agora vamos atribuir notas para os alunos...");
		Random random = new Random();
		for(int i = 0; i < notas.length; i++) {
			notas[i] = random.nextInt(11);
		}
		System.out.println("Atribuimos com sucesso notas para os alunos! Agora vamos listar as notas...");
		int aluno = 1;
		for(int nota : notas) {
			System.out.println("Aluno " + aluno + ", nota:  " + nota);
			aluno++;
		}
		aluno = 1;
		System.out.println("Agora iremos listas as notas que estão na média: ");
		for(int nota : notas) {
			if(nota >= 7) {
				System.out.println("Aluno " + aluno + ", nota:  " + nota);
			}
			aluno++;
		}
		aluno = 1;
		System.out.println("Agora iremos listas as notas abaixo da média: ");
		for(int nota : notas) {
			if(nota < 7) {
				System.out.println("Aluno " + aluno + ", nota:  " + nota);
			}
			aluno++;
		}
	}
}
