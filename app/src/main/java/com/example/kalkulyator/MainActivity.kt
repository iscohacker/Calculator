package com.example.kalkulyator

import android.annotation.SuppressLint
import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.example.kalkulyator.databinding.ActivityMainBinding
import net.objecthunter.exp4j.ExpressionBuilder
import java.math.BigDecimal
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private var checked = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.apply {
            val media4 = MediaPlayer.create(this@MainActivity, R.raw.theme)
            btn0.setOnClickListener(this@MainActivity)
            btn1.setOnClickListener(this@MainActivity)
            btn2.setOnClickListener(this@MainActivity)
            btn3.setOnClickListener(this@MainActivity)
            btn4.setOnClickListener(this@MainActivity)
            btn5.setOnClickListener(this@MainActivity)
            btn6.setOnClickListener(this@MainActivity)
            btn7.setOnClickListener(this@MainActivity)
            btn8.setOnClickListener(this@MainActivity)
            btn9.setOnClickListener(this@MainActivity)
            btnAc.setOnClickListener(this@MainActivity)
            btnBolish.setOnClickListener(this@MainActivity)
            btnDelet.setOnClickListener(this@MainActivity)
            btnFoiz.setOnClickListener(this@MainActivity)
            btnMinus.setOnClickListener(this@MainActivity)
            btnQoshish.setOnClickListener(this@MainActivity)
            btnTeng.setOnClickListener(this@MainActivity)
            btnTochka.setOnClickListener(this@MainActivity)
            btnX.setOnClickListener(this@MainActivity)
            gravity.setOnClickListener {
                media4.start()
                val intent = Intent(this@MainActivity, NightActivity::class.java)
                startActivity(intent)
                finish()
            }
        }
    }


    @SuppressLint("SetTextI18n")
    override fun onClick(v: View?) {

        try {

            val id = v?.id
            val media1 = MediaPlayer.create(this, R.raw.btin)
            val media2 = MediaPlayer.create(this, R.raw.clear)
            val media3 = MediaPlayer.create(this, R.raw.delet)
            var amal = false

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
