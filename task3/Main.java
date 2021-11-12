package by.minsk.epam.kozlova.task3;

import by.minsk.epam.kozlova.task3.Lexeme.LexAnalyze;
import by.minsk.epam.kozlova.task3.Lexeme.Lexeme;
import by.minsk.epam.kozlova.task3.Lexeme.LexemeBuffer;

import java.util.List;

import static by.minsk.epam.kozlova.task3.Lexeme.LexemeBuffer.expr;

public class Main {

    public static void main(String[] args) {
        String expressionText = "122 - 34 - 3* (55 + 5* (3 - 2)) * 2";
        List<Lexeme> lexemes = LexAnalyze.lexAnalyze(expressionText);
        LexemeBuffer lexemeBuffer = new LexemeBuffer(lexemes);
        System.out.println(expr(lexemeBuffer));
    }
    }

