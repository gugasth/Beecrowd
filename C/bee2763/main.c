#include <stdio.h>
#include <string.h>
#include <ctype.h>

int main(){
    char cpf[14];
    scanf("%s", &cpf);

    for (int i=0; i<strlen(cpf); i++){
        // se é um número
        if (isdigit(cpf[i])){
            // armazena o número
            printf("%c",cpf[i]);
        } // senão imprime a quebra de linha
        else printf("\n");
    }
    printf("\n");

    return 0;
}