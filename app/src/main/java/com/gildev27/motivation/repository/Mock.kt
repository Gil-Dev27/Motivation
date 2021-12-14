package com.gildev27.motivation.repository

import com.gildev27.motivation.infra.MotivationConstants
import java.util.Random

data class Phrase(val description: String, val category: Int)

class Mock {

    private val allPhrases = MotivationConstants.PHRASEFILTER.INFINITY
    private val happyPhrases = MotivationConstants.PHRASEFILTER.SMILE
    private val morningPhrases = MotivationConstants.PHRASEFILTER.SUNNY

    private val mListPhrase: List<Phrase> = listOf(
        Phrase("Você é incrivel, nunca deixe que as pessoas o(a) desanime!", happyPhrases),
        Phrase("Seja a sua melhor versão!", happyPhrases),
        Phrase("Acredite em si mesmo, você é capaz de alcançar seu objetivos!", happyPhrases),
        Phrase("Quando uma porta se fecha, Deus abre 3 janelas pra você!", happyPhrases),
        Phrase("Faça o bem ao seu próximo!", happyPhrases),
        Phrase("Ame a si mesmo!", happyPhrases),
        Phrase("Faça exercícios e se hidrate!", happyPhrases),
        Phrase("Bom dia, que o seu dia seja maravilhoso!", morningPhrases),
        Phrase("Tenha uma semana maravilhosa e abençoada!", morningPhrases),
        Phrase("Olá, lembre-se de sempre agradecer pelas pequenas conquistas!", morningPhrases),
        Phrase("Bom dia, por mais que as coisas estejam dificeis, não se desanime nada acontece por acaso!", morningPhrases),
        Phrase("Olá, ja fez suas tarefas de hoje? Esforce-se e será recompensado!", morningPhrases),
        Phrase("Bom dia, você sempre será sua propria motivação!", morningPhrases),
        Phrase("Bom dia, que tal umas atividades para ativar o corpo e a mente?", morningPhrases)
    )

    fun getPhrase(categoryId: Int): String {
        val filtered = mListPhrase.filter { (it.category == categoryId || categoryId == allPhrases) }

        val rand = Random().nextInt(filtered.size)

        return filtered[rand].description
    }
}