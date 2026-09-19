function reverseWords(s: string): string {
    let palavra: string[] = s.split(' ');

    for (let i = 0; i < palavra.length; i++) {
        palavra[i] = palavra[i].split('').reverse().join('');
    }

    const result = palavra.join(' ');
    return result;
};