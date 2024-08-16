package com.example.compiler;

import com.google.auto.service.AutoService;

import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Filer;
import javax.annotation.processing.Messager;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedOptions;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.TypeElement;
import javax.lang.model.util.Elements;
import javax.lang.model.util.Types;
import javax.tools.Diagnostic;

@AutoService(Process.class)
@SupportedAnnotationTypes("com.example.annotation.Arouter")
@SupportedSourceVersion(SourceVersion.RELEASE_11) // 环境的版本
// 接收 安卓工程传递过来的参数
@SupportedOptions("student")
public class ArouterProcessor extends AbstractProcessor {

    // 操作Element的工具类 (类、函数、属性、其实都是Element)
    private Elements elementTool;

    // type(类信息)的工具类，报行用于操作TypeMirror的工具方法
    private Types typeTool;

    // Message 用来打印 日志相关信息
    private Messager messager;

    // 文件生成器 类、资源等，就是最终要生成的文件，是需要Filer来完成的
    private Filer filer;

    @Override
    public synchronized void init(ProcessingEnvironment processingEnvironment) {
        super.init(processingEnvironment);

        elementTool = processingEnvironment.getElementUtils();
        messager = processingEnvironment.getMessager();
        filer = processingEnvironment.getFiler();

        String value = processingEnvironment.getOptions().get("student");
        messager.printMessage(Diagnostic.Kind.NOTE, ">>>>>>>>>>>>>>>" + value);
    }

    // 在编译的时候干活
    @Override
    public boolean process(Set<? extends TypeElement> set, RoundEnvironment roundEnvironment) {
        messager.printMessage(Diagnostic.Kind.NOTE, ">>>>>>>>>>>> Chenwei run");
        return false;
    }
}
