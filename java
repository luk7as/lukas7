var minhaVariavelTexto = "Hello Word";
console.log(minhaVariavelTexto);
console.log(typeof(minhaVariavelTexto));

minhaVariavelTexto = 9
console.log(minhaVariavelTexto);
console.log(typeof(minhaVariavelTexto));

/*

CRIAR TRÊS VARIAVEIS:

Armazenar nome do aluno
Nota do 1 bimestre do aluno
Nota do 2 bimestre do aluno
Carregar valores e mostrar no console

 */

var nomeDoAluno = "Lucas Pereira";
var nota1Bim = 4.8;
var nota2Bim = 9.7;
console.log("Nome:",nomeDoAluno);
console.log("Nota 1Bim:",nota1Bim);
console.log("Nota 2Bim:",nota2Bim);

console.log("Tipo Nome:",typeof (nomeDoAluno));
console.log("Tipo Nota 1Bim:",typeof (nota1Bim));
console.log("Tipo Nota 2Bim:",typeof (nota2Bim));

/*

OPERADORES:

= Atribuições
+ Soma
- Subtração
* Multiplicação
/ Divisão
% (Mod) Resto da divisão

*/


/*

CRIAR UMA VARIAVEL MÉDIA DO SEMESTRE NOTA 1BIM = NOTA 2BIM / 2

*/

var media = (nota1Bim + nota2Bim) / 2;
console.log= ("Sua Media bimestral é:", media);
