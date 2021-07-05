package com.example.calculatorir

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun Calcular(view: View) {

        var etsalaryMonth = findViewById<EditText>(R.id.etSalaryMoth).text.toString();
        var salaryMonth = etsalaryMonth!!.toDouble();
        var ir = IR(salaryMonth);
        ir.calculate();
        showResults(ir);
    }

    fun showResults(ir: IR) {

        var setSalary = findViewById<EditText>(R.id.salaryAnual);
        setSalary.setText(ir.annualSalary.toString());

        var setInss = findViewById<EditText>(R.id.etInss)
        setInss.setText(ir.inssDeduction.toString());

        var setNetSalary = findViewById<EditText>(R.id.etNetSalary);
        setNetSalary.setText(ir.netSalary.toString());

        var setAmountApplyIR = findViewById<EditText>(R.id.etAmountApplyIR)
        setAmountApplyIR.setText(ir.amountApplyIR.toString());

        var setAnnualIR = findViewById<EditText>(R.id.etAnnualIR)
        setAnnualIR.setText(ir.annualIR.toString());

        var setMonthlyIR = findViewById<EditText>(R.id.etMonthlyIR)
        setMonthlyIR.setText(ir.monthlyIR.toString());


    }

}