#include <stdio.h>

int main() {
    int filhos=1,filhas=1;


    while (filhos > 0 & filhas > 0){
        scanf("%d%d", &filhos, &filhas);
        int quant_total = filhos+filhas;

        if (filhos > 0 & filhas > 0) {
            printf("%d\n", quant_total);
        }
    }

    return 0;
}
