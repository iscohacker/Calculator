package com.example.kalkulyator

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.kalkulyator.databinding.ActivityMainBinding
import com.example.kalkulyator.databinding.ActivityNightBinding
import com.example.kalkulyator.databinding.ActivityNightBinding.inflate
import net.objecthunter.exp4j.ExpressionBuilder
import java.math.BigDecimal

class NightActivity : AppCompatActivity(), View.OnClickListener {
    private var checked = false
    private val binding by lazy { ActivityNightBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.apply {
            val media4 = MediaPlayer.create(this@NightActivity, R.raw.theme)
            btn0.setOnClickListener(this@NightActivity)
            btn1.setOnClickListener(this@NightActivity)
            btn2.setOnClickListener(this@NightActivity)
            btn3.setOnClickListener(this@NightActivity)
            btn4.setOnClickListener(this@NightActivity)
            btn5.setOnClickListener(this@NightActivity)
            btn6.setOnClickListener(this@NightActivity)
            btn7.setOnClickListener(this@NightActivity)
            btn8.setOnClickListener(this@NightActivity)
            btn9.setOnClickListener(this@NightActivity)
            btnAc.setOnClickListener(this@NightActivity)
            btnBolish.setOnClickListener(this@NightActivity)
            btnDelet.setOnClickListener(this@NightActivity)
            btnFoiz.setOnClickListener(this@NightActivity)
            btnMinus.setOnClickListener(this@NightActivity)
            btnQoshish.setOnClickListener(this@NightActivity)
            btnTeng.setOnClickListener(this@NightActivity)
            btnTochka.setOnClickListener(this@NightActivity)
            btnX.setOnClickListener(this@NightActivity)
            gravity.setOnClickListener {
                media4.start()
                val intent = Intent(this@NightActivity, MainActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
    }


    override fun onClick(v: View?) {

        try {

            val id = v?.id
            val media1 = MediaPlayer.create(this, R.raw.btin)
            val media2 = MediaPlayer.create(this, R.raw.clear)
            val media3 = MediaPlayer.create(this, R.raw.delet)
            val media5 = MediaPlayer.create(this, R.raw.answer)

            when (id) {

                R.id.btn_0 -> {
                    media1.start()
                    emptyAdd()
                    binding.tvAnswer.append("0")
                    val txt = binding.tvAnswer.text.toString()
                    if (txt.any { it == '+' } || txt.any { it == '-' } || txt.any { it == '*' } || txt.any { it == '/' }) {
                        binding.answerHint.visibility = View.VISIBLE
                        val javob = ExpressionBuilder(txt).build()
                        binding.answerHint.text = "=" + BigDecimal(javob.evaluate()).toString()
                    } else {
                        binding.answerHint.visibility = View.GONE
                    }
                }

                R.id.btn_1 -> {
                    if (checked) {
                        media1.start()
                        emptyAdd()
                        checked = false
                        binding.tvAnswer.text = ""
                        binding.tvAnswer.append("1")
                        val txt = binding.tvAnswer.text.toString()
                        if (txt.any { it == '+' } || txt.any { it == '-' } || txt.any { it == '*' } || txt.any { it == '/' }) {
                            binding.answerHint.visibility = View.VISIBLE
                            val javob = ExpressionBuilder(txt).build()
                            binding.answerHint.text = "=" + BigDecimal(javob.evaluate()).toString()
                        } else {
                            binding.answerHint.visibility = View.GONE
                        }
                    } else {
                        media1.start()
                        emptyAdd()
                        binding.tvAnswer.append("1")
                        val txt = binding.tvAnswer.text.toString()
                        if (txt.any { it == '+' } || txt.any { it == '-' } || txt.any { it == '*' } || txt.any { it == '/' }) {
                            binding.answerHint.visibility = View.VISIBLE
                            val javob = ExpressionBuilder(txt).build()
                            binding.answerHint.text = "=" + BigDecimal(javob.evaluate()).toString()
                        } else {
                            binding.answerHint.visibility = View.GONE
                        }

                    }

                }

                R.id.btn_2 -> {
                    if (checked) {
                        media1.start()
                        emptyAdd()
                        checked = false
                        binding.tvAnswer.text = ""
                        binding.tvAnswer.append("2")
                        val txt = binding.tvAnswer.text.toString()
                        if (txt.any { it == '+' } || txt.any { it == '-' } || txt.any { it == '*' } || txt.any { it == '/' }) {
                            binding.answerHint.visibility = View.VISIBLE
                            val javob = ExpressionBuilder(txt).build()
                            binding.answerHint.text = "=" + BigDecimal(javob.evaluate()).toString()
                        } else {
                            binding.answerHint.visibility = View.GONE
                        }
                    } else {
                        media1.start()
                        emptyAdd()
                        binding.tvAnswer.append("2")
                        val txt = binding.tvAnswer.text.toString()
                        if (txt.any { it == '+' } || txt.any { it == '-' } || txt.any { it == '*' } || txt.any { it == '/' }) {
                            binding.answerHint.visibility = View.VISIBLE
                            val javob = ExpressionBuilder(txt).build()
                            binding.answerHint.text = "=" + BigDecimal(javob.evaluate()).toString()
                        } else {
                            binding.answerHint.visibility = View.GONE
                        }
                    }
                }

                R.id.btn_3 -> {
                    if (checked) {
                        media1.start()
                        emptyAdd()
                        checked = false
                        binding.tvAnswer.text = ""
                        binding.tvAnswer.append("3")
                        val txt = binding.tvAnswer.text.toString()
                        if (txt.any { it == '+' } || txt.any { it == '-' } || txt.any { it == '*' } || txt.any { it == '/' }) {
                            binding.answerHint.visibility = View.VISIBLE
                            val javob = ExpressionBuilder(txt).build()
                            binding.answerHint.text = "=" + BigDecimal(javob.evaluate()).toString()
                        } else {
                            binding.answerHint.visibility = View.GONE
                        }
                    } else {
                        media1.start()
                        emptyAdd()
                        binding.tvAnswer.append("3")
                        val txt = binding.tvAnswer.text.toString()
                        if (txt.any { it == '+' } || txt.any { it == '-' } || txt.any { it == '*' } || txt.any { it == '/' }) {
                            binding.answerHint.visibility = View.VISIBLE
                            val javob = ExpressionBuilder(txt).build()
                            binding.answerHint.text = "=" + BigDecimal(javob.evaluate()).toString()
                        } else {
                            binding.answerHint.visibility = View.GONE
                        }
                    }
                }

                R.id.btn_4 -> {
                    if (checked) {
                        media1.start()
                        emptyAdd()
                        checked = false
                        binding.tvAnswer.text = ""
                        binding.tvAnswer.append("4")
                        val txt = binding.tvAnswer.text.toString()
                        if (txt.any { it == '+' } || txt.any { it == '-' } || txt.any { it == '*' } || txt.any { it == '/' }) {
                            binding.answerHint.visibility = View.VISIBLE
                            val javob = ExpressionBuilder(txt).build()
                            binding.answerHint.text = "=" + BigDecimal(javob.evaluate()).toString()
                        } else {
                            binding.answerHint.visibility = View.GONE
                        }
                    } else {
                        media1.start()
                        emptyAdd()
                        binding.tvAnswer.append("4")
                        val txt = binding.tvAnswer.text.toString()
                        if (txt.any { it == '+' } || txt.any { it == '-' } || txt.any { it == '*' } || txt.any { it == '/' }) {
                            binding.answerHint.visibility = View.VISIBLE
                            val javob = ExpressionBuilder(txt).build()
                            binding.answerHint.text = "=" + BigDecimal(javob.evaluate()).toString()
                        } else {
                            binding.answerHint.visibility = View.GONE
                        }
                    }
                }

                R.id.btn_5 -> {
                    if (checked) {
                        media1.start()
                        emptyAdd()
                        checked = false
                        binding.tvAnswer.text = ""
                        binding.tvAnswer.append("5")
                        val txt = binding.tvAnswer.text.toString()
                        if (txt.any { it == '+' } || txt.any { it == '*' } || txt.any { it == '*' } || txt.any { it == '/' }) {
                            binding.answerHint.visibility = View.VISIBLE
                            val javob = ExpressionBuilder(txt).build()
                            binding.answerHint.text = "=" + BigDecimal(javob.evaluate()).toString()
                        } else {
                            binding.answerHint.visibility = View.GONE
                        }
                    } else {
                        media1.start()
                        emptyAdd()
                        binding.tvAnswer.append("5")
                        val txt = binding.tvAnswer.text.toString()
                        if (txt.any { it == '+' } || txt.any { it == '*' } || txt.any { it == '*' } || txt.any { it == '/' }) {
                            binding.answerHint.visibility = View.VISIBLE
                            val javob = ExpressionBuilder(txt).build()
                            binding.answerHint.text = "=" + BigDecimal(javob.evaluate()).toString()
                        } else {
                            binding.answerHint.visibility = View.GONE
                        }
                    }
                }

                R.id.btn_6 -> {
                    if (checked) {
                        media1.start()
                        emptyAdd()
                        checked = false
                        binding.tvAnswer.text = ""
                        binding.tvAnswer.append("6")
                        val txt = binding.tvAnswer.text.toString()
                        if (txt.any { it == '+' } || txt.any { it == '-' } || txt.any { it == '*' } || txt.any { it == '/' }) {
                            binding.answerHint.visibility = View.VISIBLE
                            val javob = ExpressionBuilder(txt).build()
                            binding.answerHint.text = "=" + BigDecimal(javob.evaluate()).toString()
                        } else {
                            binding.answerHint.visibility = View.GONE
                        }
                    } else {
                        media1.start()
                        emptyAdd()
                        binding.tvAnswer.append("6")
                        val txt = binding.tvAnswer.text.toString()
                        if (txt.any { it == '+' } || txt.any { it == '-' } || txt.any { it == '*' } || txt.any { it == '/' }) {
                            binding.answerHint.visibility = View.VISIBLE
                            val javob = ExpressionBuilder(txt).build()
                            binding.answerHint.text = "=" + BigDecimal(javob.evaluate()).toString()
                        } else {
                            binding.answerHint.visibility = View.GONE
                        }
                    }
                }

                R.id.btn_7 -> {
                    if (checked) {
                        media1.start()
                        emptyAdd()
                        checked = false
                        binding.tvAnswer.text = ""
                        binding.tvAnswer.append("7")
                        val txt = binding.tvAnswer.text.toString()
                        if (txt.any { it == '+' } || txt.any { it == '-' } || txt.any { it == '*' } || txt.any { it == '/' }) {
                            binding.answerHint.visibility = View.VISIBLE
                            val javob = ExpressionBuilder(txt).build()
                            binding.answerHint.text = "=" + BigDecimal(javob.evaluate()).toString()
                        } else {
                            binding.answerHint.visibility = View.GONE
                        }
                    } else {
                        media1.start()
                        emptyAdd()
                        binding.tvAnswer.append("7")
                        val txt = binding.tvAnswer.text.toString()
                        if (txt.any { it == '+' } || txt.any { it == '-' } || txt.any { it == '*' } || txt.any { it == '/' }) {
                            binding.answerHint.visibility = View.VISIBLE
                            val javob = ExpressionBuilder(txt).build()
                            binding.answerHint.text = "=" + BigDecimal(javob.evaluate()).toString()
                        } else {
                            binding.answerHint.visibility = View.GONE
                        }
                    }
                }

                R.id.btn_8 -> {
                    if (checked) {
                        media1.start()
                        emptyAdd()
                        checked = false
                        binding.tvAnswer.text = ""
                        binding.tvAnswer.append("8")
                        val txt = binding.tvAnswer.text.toString()
                        if (txt.any { it == '+' } || txt.any { it == '-' } || txt.any { it == '*' } || txt.any { it == '/' }) {
                            binding.answerHint.visibility = View.VISIBLE
                            val javob = ExpressionBuilder(txt).build()
                            binding.answerHint.text = "=" + BigDecimal(javob.evaluate()).toString()
                        } else {
                            binding.answerHint.visibility = View.GONE
                        }
                    } else {
                        media1.start()
                        emptyAdd()
                        binding.tvAnswer.append("8")
                        val txt = binding.tvAnswer.text.toString()
                        if (txt.any { it == '+' } || txt.any { it == '-' } || txt.any { it == '*' } || txt.any { it == '/' }) {
                            binding.answerHint.visibility = View.VISIBLE
                            val javob = ExpressionBuilder(txt).build()
                            binding.answerHint.text = "=" + BigDecimal(javob.evaluate()).toString()
                        } else {
                            binding.answerHint.visibility = View.GONE
                        }
                    }
                }

                R.id.btn_9 -> {
                    if (checked) {
                        media1.start()
                        emptyAdd()
                        checked = false
                        binding.tvAnswer.text = ""
                        binding.tvAnswer.append("9")
                        val txt = binding.tvAnswer.text.toString()
                        if (txt.any { it == '+' } || txt.any { it == '-' } || txt.any { it == '*' } || txt.any { it == '/' }) {
                            binding.answerHint.visibility = View.VISIBLE
                            val javob = ExpressionBuilder(txt).build()
                            binding.answerHint.text = "=" + BigDecimal(javob.evaluate()).toString()
                        } else {
                            binding.answerHint.visibility = View.GONE
                        }
                    } else {
                        media1.start()
                        emptyAdd()
                        binding.tvAnswer.append("9")
                        val txt = binding.tvAnswer.text.toString()
                        if (txt.any { it == '+' } || txt.any { it == '-' } || txt.any { it == '*' } || txt.any { it == '/' }) {
                            binding.answerHint.visibility = View.VISIBLE
                            val javob = ExpressionBuilder(txt).build()
                            binding.answerHint.text = "=" + BigDecimal(javob.evaluate()).toString()
                        } else {
                            binding.answerHint.visibility = View.GONE
                        }
                    }
                }


                R.id.btn_qoshish -> {
                    media1.start()
                    checked = false
                    if (binding.tvAnswer.text.toString() == "0") {
                        Toast.makeText(this, "Hech narsa topilmadi!", Toast.LENGTH_SHORT).show()
                    } else {
                        val text = binding.tvAnswer.text.toString()
                        if (!text.endsWith("+") && !text.endsWith("-") && !text.endsWith("*") && !text.endsWith(
                                "/"
                            )
                        ) {
                            binding.tvAnswer.append("+")
                        }
                    }
                }


                R.id.btn_minus -> {
                    media1.start()
                    checked = false
                    if (binding.tvAnswer.text.toString() == "0") {
                        Toast.makeText(this, "Hech narsa topilmadi!", Toast.LENGTH_SHORT).show()
                    } else {
                        val text = binding.tvAnswer.text.toString()
                        if (!text.endsWith("+") && !text.endsWith("-") && !text.endsWith("*") && !text.endsWith(
                                "/"
                            )
                        ) {
                            binding.tvAnswer.append("-")
                        }
                    }
                }

                R.id.btn_x -> {
                    media1.start()
                    checked = false
                    if (binding.tvAnswer.text.toString() == "0") {
                        Toast.makeText(this, "Hech narsa topilmadi!", Toast.LENGTH_SHORT).show()
                    } else {
                        val text = binding.tvAnswer.text.toString()
                        if (!text.endsWith("+") && !text.endsWith("-") && !text.endsWith("*") && !text.endsWith(
                                "/"
                            )
                        ) {

                            binding.tvAnswer.append("*")


                        }
                    }
                }

                R.id.btn_bolish -> {
                    media1.start()
                    checked = false
                    if (binding.tvAnswer.text.toString() == "0") {
                        Toast.makeText(this, "Hech narsa topilmadi!", Toast.LENGTH_SHORT).show()
                    } else {
                        val text = binding.tvAnswer.text.toString()
                        if (!text.endsWith("+") && !text.endsWith("-") && !text.endsWith("*") && !text.endsWith(
                                "/"
                            )
                        ) {

                            binding.tvAnswer.append("/")

                        }
                    }
                }

                R.id.btn_tochka -> {
                    emptyAdd()
                    checked = false
                    if (binding.tvAnswer.text.length == 0) {
                        Toast.makeText(this, "Iltimos, son kiriting", Toast.LENGTH_SHORT).show()
                        binding.tvAnswer.text = "0"
                    } else {
                        binding.tvAnswer.append(".")
                    }
                }


                R.id.btn_ac -> {
                    checked = false
                    if (binding.tvAnswer.text == "0") {
                        Toast.makeText(this, "O'chirishga narsa yo'q", Toast.LENGTH_SHORT).show()
                        binding.tvAnswer.text = "0"
                    } else {
                        binding.tvAnswer.text = "0"
                        binding.answerHint.visibility = View.GONE
                        media2.start()
                    }
                }

                R.id.btn_delet -> {
                    checked = false
                    if (binding.tvAnswer.text.length > 1) {
                        media3.start()
                        val text = binding.tvAnswer.text
                        binding.tvAnswer.text = text.substring(0, text.length - 1)
                        val txt = binding.tvAnswer.text.toString()
                        val tv = txt.substring(txt.length - 1, txt.length)
                        if (txt.any { it == '+' } || txt.any { it == '-' } || txt.any { it == '*' } || txt.any { it == '/' }) {

                            if (tv.any { it == '+' } || tv.any { it == '-' } || tv.any { it == '*' } || tv.any { it == '/' }) {
                                binding.answerHint.visibility = View.GONE
                            } else {
                                binding.answerHint.visibility = View.VISIBLE
                                val javob = ExpressionBuilder(txt).build()
                                binding.answerHint.text =
                                    "=" + BigDecimal(javob.evaluate()).toString()
                            }
                        } else {
                            binding.answerHint.visibility = View.GONE
                        }
                    } else {
                        binding.tvAnswer.text = "0"
                    }
                }

                R.id.btn_teng -> {
                    try {
                        if (binding.tvAnswer.text == "0") {
                            Toast.makeText(
                                this,
                                "Son kiritmasdan hisoblash imkonsiz!",
                                Toast.LENGTH_SHORT
                            ).show()
                        } else {
                            media1.start()
                            checked = true
                            val javob = ExpressionBuilder(binding.tvAnswer.text.toString()).build()
                            binding.tvAnswer.text = BigDecimal(javob.evaluate()).toString()
                            binding.answerHint.visibility = View.GONE
                        }
                    } catch (e: Exception) {
                        Toast.makeText(this, "Nimadir nito ketvotti🤣", Toast.LENGTH_SHORT).show()
                    }
                }
            }
        } catch (e: Exception) {
            Toast.makeText(this, "Nimadir nito", Toast.LENGTH_SHORT).show()
        }

    }

    private fun emptyAdd() {

        val text = binding.tvAnswer.text.toString()
        if (text == "0") {
            binding.tvAnswer.text = ""
        }
    }
}