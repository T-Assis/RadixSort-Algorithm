# RadixSort-Algorithm
## English:

A fairly old algorithm, used before computers. Computer algorithm developed by Harold H. Seward in 1954 at MIT (same time as CountSort).

Radix sort is a fast and stable sort algorithm, which can be used to sort elements that are identified by unique keys. Each key is a string or number, and radix sort, sorts these keys in any order related to the lexicography of the elements.

In computer science, radix sort is a sorting algorithm that sorts integers by processing individual digits. Because integers can represent strings composed of characters (such as names or dates) and specially formatted floating points, radix sort is not limited to integers.

Most computers internally represent all kinds of data as binary numbers, so rendering the digits in the form of integers into groups represented by binary digits becomes more convenient. There are two radix sort classifications, which are:
 - Least significant digit (LSD) radix sort;
 - Most significant digit (MSD) radix sort.

The radix sort LSD starts from the least significant digit to the most significant, typically typing as follows: short keys come before long keys, and keys of the same size are lexicographically ordered. This coincides with the normal order of representation of integers, such as the sequence "1, 2, 3, 4, 5, 6, 7, 8, 9, 10". The values processed by the sort algorithm are often called "keys", which may exist by themselves or associated with other data. Keys can be strings of characters or numbers.

the radix sort MSD works in the opposite direction, always using the lexicographic order, which is suitable for ordering strings, such as words, or representations of integers with fixed size. The sequence "b, c, d, e, f, g, h, i, j, ba" will be ordered lexicographically as "b, b, c, d, e, f, g, h, i, j". If this ordering is used to sort representations of integers with variable length, then the representation of integers from 1 to 10 will have the output "1, 10, 2, 3, 4, 5, 6, 7, 8, 9".

- In this project, it was decided to only implement radix sort for integers (in the future we will have an update demonstrating word ordering)

### Asymptotic complexity:
The time complexity of Radix sort is O(nk) and the space complexity is O(n + s), where:
- n = number of elements.
- k = size of the largest element (number of digits).
- s = alphabet size (numbers: 0 - 9 or letters: A - Z).

## Example:
Given the initial vector: [831, 1234, 10, 13, 35, 67, 0, 693, 56, 842, 88, 99, 44,0], the following image demonstrates the step by step of Radix Sort (this image is based on the code of this project).

![radixsortimage](https://user-images.githubusercontent.com/17066350/51336751-7b5d1a00-1a6c-11e9-893d-9e8436bb87a7.jpg)

**Vector after passing through the Radix Sort algorithm:** [0, 0, 10, 13, 35, 44, 56, 67, 88, 99, 693, 831, 842, 1234]

## References:
 - https://www.geeksforgeeks.org/radix-sort/
 - https://pt.wikipedia.org/wiki/Radix_sort
 - http://www.java67.com/2018/03/how-to-implement-radix-sort-in-java.html
 - https://en.wikipedia.org/wiki/Radix_sort
 - https://www.javatpoint.com/radix-sort
 
## ====================================================

## Português:

Um algoritmo bastante antigo, utilizado antes dos computadores. Algoritmo computacional desenvolvido por Harold H. Seward em 1954 no MIT (mesma época do CountSort).

O Radix sort é um algoritmo de ordenação rápido e estável, que pode ser usado para ordenar elementos que estão identificados por chaves únicas. Cada chave é uma cadeia de caracteres ou número, e o radix sort, ordena estas chaves em qualquer ordem relacioanda com a lexicografia dos elementos.

Na ciência da computação, radix sort é um algoritmo de ordenação que ordena inteiros processando dígitos individuais. Como os inteiros podem representar strings compostas de caracteres (como nomes ou datas) e pontos flutuantes especialmente formatados, radix sort não é limitado somente a inteiros.

Computadores, na sua maioria, representam internamente todos os tipo de dados como números binários, por isso processar os dígitos na forma de inteiros em grupos representados por dígitos binários se torna mais conveniente. Existem duas classificações do radix sort, que são:
 - Least significant digit (LSD – Dígito menos significativo) radix sort;
 - Most significant digit (MSD – Dígito mais significativo) radix sort.

O radix sort LSD começa do dígito menos significativo até o mais significativo, ordenando tipicamente da seguinte forma: chaves curtas vem antes de chaves longas, e chaves de mesmo tamanho são ordenadas lexicograficamente. Isso coincide com a ordem normal de representação dos inteiros, como a seqüência "1, 2, 3, 4, 5, 6, 7, 8, 9, 10". Os valores processados pelo algoritmo de ordenação são frequentemente chamados de “chaves”, que podem existir por si próprias ou associadas a outros dados. As chaves podem ser strings de caracteres ou números.

O radix sort MSD trabalha no sentido contrário, usando sempre a ordem lexicográfica, que é adequada para ordenação de strings, como palavras, ou representações de inteiros com tamanho fixo. A seqüência "b, c, d, e, f, g, h, i, j, ba" será ordenada lexicograficamente como "b, ba, c, d, e, f, g, h, i, j". Se essa ordenação for usada para ordenar representações de inteiros com tamanho variável, então a representação dos números inteiros de 1 a 10 terá a saída "1, 10, 2, 3, 4, 5, 6, 7, 8, 9".

- Neste projeto, foi decidido apenas a implementação do radix sort para números inteiros (futuramente teremos uma atualização demonstrando a ordenação de palavras)

### Complexidade assintótica:
A complexidade de tempo do Radix sort é O(nk) e a complexidade de espaço é O(n+s), onde:
 - n = número de elementos.
 - k = tamanho do maior elemento (número de digitos).
 - s = tamanho do alfabeto (números: 0 - 9 ou letras: A - Z).

## Exemplo:

Dado o vetor inicial: [ 831, 1234, 10, 13, 35, 67, 0, 693, 56, 842, 88, 99, 44, 0 ], a imagem a seguir demonstra o passo a passo das etapas do Radix Sort(esta imagem é com base no código deste projeto).

![radixsortimage](https://user-images.githubusercontent.com/17066350/51336751-7b5d1a00-1a6c-11e9-893d-9e8436bb87a7.jpg)

**Vetor após ter passado pelo algoritmo Radix Sort:** [ 0, 0, 10, 13, 35, 44, 56, 67, 88, 99, 693, 831, 842, 1234 ]

## Referências:
 - https://www.geeksforgeeks.org/radix-sort/
 - https://pt.wikipedia.org/wiki/Radix_sort
 - http://www.java67.com/2018/03/how-to-implement-radix-sort-in-java.html
 - https://en.wikipedia.org/wiki/Radix_sort
 - https://www.javatpoint.com/radix-sort
