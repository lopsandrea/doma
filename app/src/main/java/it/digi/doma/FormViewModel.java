package it.digi.doma;

import android.arch.lifecycle.ViewModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class FormViewModel extends ViewModel {
    private int pagerPosition;

    private String eta ;

    private String sono ;

    private String tipo ;

    private String fumo ;

    private String eta1 ;

    private String sono1 ;

    private String tipo1 ;

    private String fumo1 ;

    private String sesso;
    private String sesso1;

    public final int getPagerPosition() {
        return this.pagerPosition;
    }

    public final void setPagerPosition(int var1) {
        this.pagerPosition = var1;
    }

    public String getEta() {
        return eta;
    }

    public String getSono() {
        return sono;
    }

    public String getTipo() {
        return tipo;
    }

    public String getFumo() {
        return fumo;
    }

    public String getEta1() {
        return eta1;
    }

    public String getSono1() {
        return sono1;
    }

    public String getTipo1() {
        return tipo1;
    }

    public String getFumo1() {
        return fumo1;
    }

    public void setEta(String eta) {
        this.eta = eta;
    }

    public void setSono(String sono) {
        this.sono = sono;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setFumo(String fumo) {
        this.fumo = fumo;
    }

    public void setEta1(String eta1) {
        this.eta1 = eta1;
    }

    public void setSono1(String sono1) {
        this.sono1 = sono1;
    }

    public void setTipo1(String tipo1) {
        this.tipo1 = tipo1;
    }

    public void setFumo1(String fumo1) {
        this.fumo1 = fumo1;
    }

    public String getSesso() {
        return sesso;
    }

    public String getSesso1() {
        return sesso1;
    }

    public void setSesso1(String sesso1) {
        this.sesso1 = sesso1;
    }

    public void setSesso(String sesso) {
        this.sesso = sesso;
    }
}
