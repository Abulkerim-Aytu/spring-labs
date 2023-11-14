
package com.cydeo.lab09rest.dto;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "USDAED",
    "USDAFN",
    "USDALL",
    "USDAMD",
    "USDANG",
    "USDAOA",
    "USDARS",
    "USDAUD",
    "USDAWG",
    "USDAZN",
    "USDBAM",
    "USDBBD",
    "USDBDT",
    "USDBGN",
    "USDBHD",
    "USDBIF",
    "USDBMD",
    "USDBND",
    "USDBOB",
    "USDBRL",
    "USDBSD",
    "USDBTC",
    "USDBTN",
    "USDBWP",
    "USDBYN",
    "USDBYR",
    "USDBZD",
    "USDCAD",
    "USDCDF",
    "USDCHF",
    "USDCLF",
    "USDCLP",
    "USDCNY",
    "USDCOP",
    "USDCRC",
    "USDCUC",
    "USDCUP",
    "USDCVE",
    "USDCZK",
    "USDDJF",
    "USDDKK",
    "USDDOP",
    "USDDZD",
    "USDEGP",
    "USDERN",
    "USDETB",
    "USDEUR",
    "USDFJD",
    "USDFKP",
    "USDGBP",
    "USDGEL",
    "USDGGP",
    "USDGHS",
    "USDGIP",
    "USDGMD",
    "USDGNF",
    "USDGTQ",
    "USDGYD",
    "USDHKD",
    "USDHNL",
    "USDHRK",
    "USDHTG",
    "USDHUF",
    "USDIDR",
    "USDILS",
    "USDIMP",
    "USDINR",
    "USDIQD",
    "USDIRR",
    "USDISK",
    "USDJEP",
    "USDJMD",
    "USDJOD",
    "USDJPY",
    "USDKES",
    "USDKGS",
    "USDKHR",
    "USDKMF",
    "USDKPW",
    "USDKRW",
    "USDKWD",
    "USDKYD",
    "USDKZT",
    "USDLAK",
    "USDLBP",
    "USDLKR",
    "USDLRD",
    "USDLSL",
    "USDLTL",
    "USDLVL",
    "USDLYD",
    "USDMAD",
    "USDMDL",
    "USDMGA",
    "USDMKD",
    "USDMMK",
    "USDMNT",
    "USDMOP",
    "USDMRO",
    "USDMUR",
    "USDMVR",
    "USDMWK",
    "USDMXN",
    "USDMYR",
    "USDMZN",
    "USDNAD",
    "USDNGN",
    "USDNIO",
    "USDNOK",
    "USDNPR",
    "USDNZD",
    "USDOMR",
    "USDPAB",
    "USDPEN",
    "USDPGK",
    "USDPHP",
    "USDPKR",
    "USDPLN",
    "USDPYG",
    "USDQAR",
    "USDRON",
    "USDRSD",
    "USDRUB",
    "USDRWF",
    "USDSAR",
    "USDSBD",
    "USDSCR",
    "USDSDG",
    "USDSEK",
    "USDSGD",
    "USDSHP",
    "USDSLE",
    "USDSLL",
    "USDSOS",
    "USDSRD",
    "USDSTD",
    "USDSYP",
    "USDSZL",
    "USDTHB",
    "USDTJS",
    "USDTMT",
    "USDTND",
    "USDTOP",
    "USDTRY",
    "USDTTD",
    "USDTWD",
    "USDTZS",
    "USDUAH",
    "USDUGX",
    "USDUYU",
    "USDUZS",
    "USDVEF",
    "USDVES",
    "USDVND",
    "USDVUV",
    "USDWST",
    "USDXAF",
    "USDXAG",
    "USDXAU",
    "USDXCD",
    "USDXDR",
    "USDXOF",
    "USDXPF",
    "USDYER",
    "USDZAR",
    "USDZMK",
    "USDZMW",
    "USDZWL"
})
@Generated("jsonschema2pojo")
public class QuotesDTO {

    @JsonProperty("USDAED")
    private Double usdaed;
    @JsonProperty("USDAFN")
    private Double usdafn;
    @JsonProperty("USDALL")
    private Double usdall;
    @JsonProperty("USDAMD")
    private Double usdamd;
    @JsonProperty("USDANG")
    private Double usdang;
    @JsonProperty("USDAOA")
    private Double usdaoa;
    @JsonProperty("USDARS")
    private Double usdars;
    @JsonProperty("USDAUD")
    private Double usdaud;
    @JsonProperty("USDAWG")
    private Double usdawg;
    @JsonProperty("USDAZN")
    private Double usdazn;
    @JsonProperty("USDBAM")
    private Double usdbam;
    @JsonProperty("USDBBD")
    private Double usdbbd;
    @JsonProperty("USDBDT")
    private Double usdbdt;
    @JsonProperty("USDBGN")
    private Double usdbgn;
    @JsonProperty("USDBHD")
    private Double usdbhd;
    @JsonProperty("USDBIF")
    private Double usdbif;
    @JsonProperty("USDBMD")
    private Integer usdbmd;
    @JsonProperty("USDBND")
    private Double usdbnd;
    @JsonProperty("USDBOB")
    private Double usdbob;
    @JsonProperty("USDBRL")
    private Double usdbrl;
    @JsonProperty("USDBSD")
    private Double usdbsd;
    @JsonProperty("USDBTC")
    private Double usdbtc;
    @JsonProperty("USDBTN")
    private Double usdbtn;
    @JsonProperty("USDBWP")
    private Double usdbwp;
    @JsonProperty("USDBYN")
    private Double usdbyn;
    @JsonProperty("USDBYR")
    private Integer usdbyr;
    @JsonProperty("USDBZD")
    private Double usdbzd;
    @JsonProperty("USDCAD")
    private Double usdcad;
    @JsonProperty("USDCDF")
    private Double usdcdf;
    @JsonProperty("USDCHF")
    private Double usdchf;
    @JsonProperty("USDCLF")
    private Double usdclf;
    @JsonProperty("USDCLP")
    private Double usdclp;
    @JsonProperty("USDCNY")
    private Double usdcny;
    @JsonProperty("USDCOP")
    private Integer usdcop;
    @JsonProperty("USDCRC")
    private Double usdcrc;
    @JsonProperty("USDCUC")
    private Integer usdcuc;
    @JsonProperty("USDCUP")
    private Double usdcup;
    @JsonProperty("USDCVE")
    private Double usdcve;
    @JsonProperty("USDCZK")
    private Double usdczk;
    @JsonProperty("USDDJF")
    private Double usddjf;
    @JsonProperty("USDDKK")
    private Double usddkk;
    @JsonProperty("USDDOP")
    private Double usddop;
    @JsonProperty("USDDZD")
    private Double usddzd;
    @JsonProperty("USDEGP")
    private Double usdegp;
    @JsonProperty("USDERN")
    private Integer usdern;
    @JsonProperty("USDETB")
    private Double usdetb;
    @JsonProperty("USDEUR")
    private Double usdeur;
    @JsonProperty("USDFJD")
    private Double usdfjd;
    @JsonProperty("USDFKP")
    private Double usdfkp;
    @JsonProperty("USDGBP")
    private Double usdgbp;
    @JsonProperty("USDGEL")
    private Double usdgel;
    @JsonProperty("USDGGP")
    private Double usdggp;
    @JsonProperty("USDGHS")
    private Double usdghs;
    @JsonProperty("USDGIP")
    private Double usdgip;
    @JsonProperty("USDGMD")
    private Double usdgmd;
    @JsonProperty("USDGNF")
    private Double usdgnf;
    @JsonProperty("USDGTQ")
    private Double usdgtq;
    @JsonProperty("USDGYD")
    private Double usdgyd;
    @JsonProperty("USDHKD")
    private Double usdhkd;
    @JsonProperty("USDHNL")
    private Double usdhnl;
    @JsonProperty("USDHRK")
    private Double usdhrk;
    @JsonProperty("USDHTG")
    private Double usdhtg;
    @JsonProperty("USDHUF")
    private Double usdhuf;
    @JsonProperty("USDIDR")
    private Double usdidr;
    @JsonProperty("USDILS")
    private Double usdils;
    @JsonProperty("USDIMP")
    private Double usdimp;
    @JsonProperty("USDINR")
    private Double usdinr;
    @JsonProperty("USDIQD")
    private Double usdiqd;
    @JsonProperty("USDIRR")
    private Double usdirr;
    @JsonProperty("USDISK")
    private Double usdisk;
    @JsonProperty("USDJEP")
    private Double usdjep;
    @JsonProperty("USDJMD")
    private Double usdjmd;
    @JsonProperty("USDJOD")
    private Double usdjod;
    @JsonProperty("USDJPY")
    private Double usdjpy;
    @JsonProperty("USDKES")
    private Double usdkes;
    @JsonProperty("USDKGS")
    private Double usdkgs;
    @JsonProperty("USDKHR")
    private Double usdkhr;
    @JsonProperty("USDKMF")
    private Double usdkmf;
    @JsonProperty("USDKPW")
    private Double usdkpw;
    @JsonProperty("USDKRW")
    private Double usdkrw;
    @JsonProperty("USDKWD")
    private Double usdkwd;
    @JsonProperty("USDKYD")
    private Double usdkyd;
    @JsonProperty("USDKZT")
    private Double usdkzt;
    @JsonProperty("USDLAK")
    private Double usdlak;
    @JsonProperty("USDLBP")
    private Double usdlbp;
    @JsonProperty("USDLKR")
    private Double usdlkr;
    @JsonProperty("USDLRD")
    private Double usdlrd;
    @JsonProperty("USDLSL")
    private Double usdlsl;
    @JsonProperty("USDLTL")
    private Double usdltl;
    @JsonProperty("USDLVL")
    private Double usdlvl;
    @JsonProperty("USDLYD")
    private Double usdlyd;
    @JsonProperty("USDMAD")
    private Double usdmad;
    @JsonProperty("USDMDL")
    private Double usdmdl;
    @JsonProperty("USDMGA")
    private Double usdmga;
    @JsonProperty("USDMKD")
    private Double usdmkd;
    @JsonProperty("USDMMK")
    private Double usdmmk;
    @JsonProperty("USDMNT")
    private Double usdmnt;
    @JsonProperty("USDMOP")
    private Double usdmop;
    @JsonProperty("USDMRO")
    private Double usdmro;
    @JsonProperty("USDMUR")
    private Double usdmur;
    @JsonProperty("USDMVR")
    private Double usdmvr;
    @JsonProperty("USDMWK")
    private Double usdmwk;
    @JsonProperty("USDMXN")
    private Double usdmxn;
    @JsonProperty("USDMYR")
    private Double usdmyr;
    @JsonProperty("USDMZN")
    private Double usdmzn;
    @JsonProperty("USDNAD")
    private Double usdnad;
    @JsonProperty("USDNGN")
    private Double usdngn;
    @JsonProperty("USDNIO")
    private Double usdnio;
    @JsonProperty("USDNOK")
    private Double usdnok;
    @JsonProperty("USDNPR")
    private Double usdnpr;
    @JsonProperty("USDNZD")
    private Double usdnzd;
    @JsonProperty("USDOMR")
    private Double usdomr;
    @JsonProperty("USDPAB")
    private Double usdpab;
    @JsonProperty("USDPEN")
    private Double usdpen;
    @JsonProperty("USDPGK")
    private Double usdpgk;
    @JsonProperty("USDPHP")
    private Double usdphp;
    @JsonProperty("USDPKR")
    private Double usdpkr;
    @JsonProperty("USDPLN")
    private Double usdpln;
    @JsonProperty("USDPYG")
    private Double usdpyg;
    @JsonProperty("USDQAR")
    private Double usdqar;
    @JsonProperty("USDRON")
    private Double usdron;
    @JsonProperty("USDRSD")
    private Double usdrsd;
    @JsonProperty("USDRUB")
    private Double usdrub;
    @JsonProperty("USDRWF")
    private Double usdrwf;
    @JsonProperty("USDSAR")
    private Double usdsar;
    @JsonProperty("USDSBD")
    private Double usdsbd;
    @JsonProperty("USDSCR")
    private Double usdscr;
    @JsonProperty("USDSDG")
    private Double usdsdg;
    @JsonProperty("USDSEK")
    private Double usdsek;
    @JsonProperty("USDSGD")
    private Double usdsgd;
    @JsonProperty("USDSHP")
    private Double usdshp;
    @JsonProperty("USDSLE")
    private Double usdsle;
    @JsonProperty("USDSLL")
    private Double usdsll;
    @JsonProperty("USDSOS")
    private Double usdsos;
    @JsonProperty("USDSRD")
    private Double usdsrd;
    @JsonProperty("USDSTD")
    private Double usdstd;
    @JsonProperty("USDSYP")
    private Double usdsyp;
    @JsonProperty("USDSZL")
    private Double usdszl;
    @JsonProperty("USDTHB")
    private Double usdthb;
    @JsonProperty("USDTJS")
    private Double usdtjs;
    @JsonProperty("USDTMT")
    private Double usdtmt;
    @JsonProperty("USDTND")
    private Double usdtnd;
    @JsonProperty("USDTOP")
    private Double usdtop;
    @JsonProperty("USDTRY")
    private Double usdtry;
    @JsonProperty("USDTTD")
    private Double usdttd;
    @JsonProperty("USDTWD")
    private Double usdtwd;
    @JsonProperty("USDTZS")
    private Double usdtzs;
    @JsonProperty("USDUAH")
    private Double usduah;
    @JsonProperty("USDUGX")
    private Double usdugx;
    @JsonProperty("USDUYU")
    private Double usduyu;
    @JsonProperty("USDUZS")
    private Double usduzs;
    @JsonProperty("USDVEF")
    private Double usdvef;
    @JsonProperty("USDVES")
    private Double usdves;
    @JsonProperty("USDVND")
    private Integer usdvnd;
    @JsonProperty("USDVUV")
    private Double usdvuv;
    @JsonProperty("USDWST")
    private Double usdwst;
    @JsonProperty("USDXAF")
    private Double usdxaf;
    @JsonProperty("USDXAG")
    private Double usdxag;
    @JsonProperty("USDXAU")
    private Double usdxau;
    @JsonProperty("USDXCD")
    private Double usdxcd;
    @JsonProperty("USDXDR")
    private Double usdxdr;
    @JsonProperty("USDXOF")
    private Double usdxof;
    @JsonProperty("USDXPF")
    private Double usdxpf;
    @JsonProperty("USDYER")
    private Double usdyer;
    @JsonProperty("USDZAR")
    private Double usdzar;
    @JsonProperty("USDZMK")
    private Double usdzmk;
    @JsonProperty("USDZMW")
    private Double usdzmw;
    @JsonProperty("USDZWL")
    private Double usdzwl;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("USDAED")
    public Double getUsdaed() {
        return usdaed;
    }

    @JsonProperty("USDAED")
    public void setUsdaed(Double usdaed) {
        this.usdaed = usdaed;
    }

    @JsonProperty("USDAFN")
    public Double getUsdafn() {
        return usdafn;
    }

    @JsonProperty("USDAFN")
    public void setUsdafn(Double usdafn) {
        this.usdafn = usdafn;
    }

    @JsonProperty("USDALL")
    public Double getUsdall() {
        return usdall;
    }

    @JsonProperty("USDALL")
    public void setUsdall(Double usdall) {
        this.usdall = usdall;
    }

    @JsonProperty("USDAMD")
    public Double getUsdamd() {
        return usdamd;
    }

    @JsonProperty("USDAMD")
    public void setUsdamd(Double usdamd) {
        this.usdamd = usdamd;
    }

    @JsonProperty("USDANG")
    public Double getUsdang() {
        return usdang;
    }

    @JsonProperty("USDANG")
    public void setUsdang(Double usdang) {
        this.usdang = usdang;
    }

    @JsonProperty("USDAOA")
    public Double getUsdaoa() {
        return usdaoa;
    }

    @JsonProperty("USDAOA")
    public void setUsdaoa(Double usdaoa) {
        this.usdaoa = usdaoa;
    }

    @JsonProperty("USDARS")
    public Double getUsdars() {
        return usdars;
    }

    @JsonProperty("USDARS")
    public void setUsdars(Double usdars) {
        this.usdars = usdars;
    }

    @JsonProperty("USDAUD")
    public Double getUsdaud() {
        return usdaud;
    }

    @JsonProperty("USDAUD")
    public void setUsdaud(Double usdaud) {
        this.usdaud = usdaud;
    }

    @JsonProperty("USDAWG")
    public Double getUsdawg() {
        return usdawg;
    }

    @JsonProperty("USDAWG")
    public void setUsdawg(Double usdawg) {
        this.usdawg = usdawg;
    }

    @JsonProperty("USDAZN")
    public Double getUsdazn() {
        return usdazn;
    }

    @JsonProperty("USDAZN")
    public void setUsdazn(Double usdazn) {
        this.usdazn = usdazn;
    }

    @JsonProperty("USDBAM")
    public Double getUsdbam() {
        return usdbam;
    }

    @JsonProperty("USDBAM")
    public void setUsdbam(Double usdbam) {
        this.usdbam = usdbam;
    }

    @JsonProperty("USDBBD")
    public Double getUsdbbd() {
        return usdbbd;
    }

    @JsonProperty("USDBBD")
    public void setUsdbbd(Double usdbbd) {
        this.usdbbd = usdbbd;
    }

    @JsonProperty("USDBDT")
    public Double getUsdbdt() {
        return usdbdt;
    }

    @JsonProperty("USDBDT")
    public void setUsdbdt(Double usdbdt) {
        this.usdbdt = usdbdt;
    }

    @JsonProperty("USDBGN")
    public Double getUsdbgn() {
        return usdbgn;
    }

    @JsonProperty("USDBGN")
    public void setUsdbgn(Double usdbgn) {
        this.usdbgn = usdbgn;
    }

    @JsonProperty("USDBHD")
    public Double getUsdbhd() {
        return usdbhd;
    }

    @JsonProperty("USDBHD")
    public void setUsdbhd(Double usdbhd) {
        this.usdbhd = usdbhd;
    }

    @JsonProperty("USDBIF")
    public Double getUsdbif() {
        return usdbif;
    }

    @JsonProperty("USDBIF")
    public void setUsdbif(Double usdbif) {
        this.usdbif = usdbif;
    }

    @JsonProperty("USDBMD")
    public Integer getUsdbmd() {
        return usdbmd;
    }

    @JsonProperty("USDBMD")
    public void setUsdbmd(Integer usdbmd) {
        this.usdbmd = usdbmd;
    }

    @JsonProperty("USDBND")
    public Double getUsdbnd() {
        return usdbnd;
    }

    @JsonProperty("USDBND")
    public void setUsdbnd(Double usdbnd) {
        this.usdbnd = usdbnd;
    }

    @JsonProperty("USDBOB")
    public Double getUsdbob() {
        return usdbob;
    }

    @JsonProperty("USDBOB")
    public void setUsdbob(Double usdbob) {
        this.usdbob = usdbob;
    }

    @JsonProperty("USDBRL")
    public Double getUsdbrl() {
        return usdbrl;
    }

    @JsonProperty("USDBRL")
    public void setUsdbrl(Double usdbrl) {
        this.usdbrl = usdbrl;
    }

    @JsonProperty("USDBSD")
    public Double getUsdbsd() {
        return usdbsd;
    }

    @JsonProperty("USDBSD")
    public void setUsdbsd(Double usdbsd) {
        this.usdbsd = usdbsd;
    }

    @JsonProperty("USDBTC")
    public Double getUsdbtc() {
        return usdbtc;
    }

    @JsonProperty("USDBTC")
    public void setUsdbtc(Double usdbtc) {
        this.usdbtc = usdbtc;
    }

    @JsonProperty("USDBTN")
    public Double getUsdbtn() {
        return usdbtn;
    }

    @JsonProperty("USDBTN")
    public void setUsdbtn(Double usdbtn) {
        this.usdbtn = usdbtn;
    }

    @JsonProperty("USDBWP")
    public Double getUsdbwp() {
        return usdbwp;
    }

    @JsonProperty("USDBWP")
    public void setUsdbwp(Double usdbwp) {
        this.usdbwp = usdbwp;
    }

    @JsonProperty("USDBYN")
    public Double getUsdbyn() {
        return usdbyn;
    }

    @JsonProperty("USDBYN")
    public void setUsdbyn(Double usdbyn) {
        this.usdbyn = usdbyn;
    }

    @JsonProperty("USDBYR")
    public Integer getUsdbyr() {
        return usdbyr;
    }

    @JsonProperty("USDBYR")
    public void setUsdbyr(Integer usdbyr) {
        this.usdbyr = usdbyr;
    }

    @JsonProperty("USDBZD")
    public Double getUsdbzd() {
        return usdbzd;
    }

    @JsonProperty("USDBZD")
    public void setUsdbzd(Double usdbzd) {
        this.usdbzd = usdbzd;
    }

    @JsonProperty("USDCAD")
    public Double getUsdcad() {
        return usdcad;
    }

    @JsonProperty("USDCAD")
    public void setUsdcad(Double usdcad) {
        this.usdcad = usdcad;
    }

    @JsonProperty("USDCDF")
    public Double getUsdcdf() {
        return usdcdf;
    }

    @JsonProperty("USDCDF")
    public void setUsdcdf(Double usdcdf) {
        this.usdcdf = usdcdf;
    }

    @JsonProperty("USDCHF")
    public Double getUsdchf() {
        return usdchf;
    }

    @JsonProperty("USDCHF")
    public void setUsdchf(Double usdchf) {
        this.usdchf = usdchf;
    }

    @JsonProperty("USDCLF")
    public Double getUsdclf() {
        return usdclf;
    }

    @JsonProperty("USDCLF")
    public void setUsdclf(Double usdclf) {
        this.usdclf = usdclf;
    }

    @JsonProperty("USDCLP")
    public Double getUsdclp() {
        return usdclp;
    }

    @JsonProperty("USDCLP")
    public void setUsdclp(Double usdclp) {
        this.usdclp = usdclp;
    }

    @JsonProperty("USDCNY")
    public Double getUsdcny() {
        return usdcny;
    }

    @JsonProperty("USDCNY")
    public void setUsdcny(Double usdcny) {
        this.usdcny = usdcny;
    }

    @JsonProperty("USDCOP")
    public Integer getUsdcop() {
        return usdcop;
    }

    @JsonProperty("USDCOP")
    public void setUsdcop(Integer usdcop) {
        this.usdcop = usdcop;
    }

    @JsonProperty("USDCRC")
    public Double getUsdcrc() {
        return usdcrc;
    }

    @JsonProperty("USDCRC")
    public void setUsdcrc(Double usdcrc) {
        this.usdcrc = usdcrc;
    }

    @JsonProperty("USDCUC")
    public Integer getUsdcuc() {
        return usdcuc;
    }

    @JsonProperty("USDCUC")
    public void setUsdcuc(Integer usdcuc) {
        this.usdcuc = usdcuc;
    }

    @JsonProperty("USDCUP")
    public Double getUsdcup() {
        return usdcup;
    }

    @JsonProperty("USDCUP")
    public void setUsdcup(Double usdcup) {
        this.usdcup = usdcup;
    }

    @JsonProperty("USDCVE")
    public Double getUsdcve() {
        return usdcve;
    }

    @JsonProperty("USDCVE")
    public void setUsdcve(Double usdcve) {
        this.usdcve = usdcve;
    }

    @JsonProperty("USDCZK")
    public Double getUsdczk() {
        return usdczk;
    }

    @JsonProperty("USDCZK")
    public void setUsdczk(Double usdczk) {
        this.usdczk = usdczk;
    }

    @JsonProperty("USDDJF")
    public Double getUsddjf() {
        return usddjf;
    }

    @JsonProperty("USDDJF")
    public void setUsddjf(Double usddjf) {
        this.usddjf = usddjf;
    }

    @JsonProperty("USDDKK")
    public Double getUsddkk() {
        return usddkk;
    }

    @JsonProperty("USDDKK")
    public void setUsddkk(Double usddkk) {
        this.usddkk = usddkk;
    }

    @JsonProperty("USDDOP")
    public Double getUsddop() {
        return usddop;
    }

    @JsonProperty("USDDOP")
    public void setUsddop(Double usddop) {
        this.usddop = usddop;
    }

    @JsonProperty("USDDZD")
    public Double getUsddzd() {
        return usddzd;
    }

    @JsonProperty("USDDZD")
    public void setUsddzd(Double usddzd) {
        this.usddzd = usddzd;
    }

    @JsonProperty("USDEGP")
    public Double getUsdegp() {
        return usdegp;
    }

    @JsonProperty("USDEGP")
    public void setUsdegp(Double usdegp) {
        this.usdegp = usdegp;
    }

    @JsonProperty("USDERN")
    public Integer getUsdern() {
        return usdern;
    }

    @JsonProperty("USDERN")
    public void setUsdern(Integer usdern) {
        this.usdern = usdern;
    }

    @JsonProperty("USDETB")
    public Double getUsdetb() {
        return usdetb;
    }

    @JsonProperty("USDETB")
    public void setUsdetb(Double usdetb) {
        this.usdetb = usdetb;
    }

    @JsonProperty("USDEUR")
    public Double getUsdeur() {
        return usdeur;
    }

    @JsonProperty("USDEUR")
    public void setUsdeur(Double usdeur) {
        this.usdeur = usdeur;
    }

    @JsonProperty("USDFJD")
    public Double getUsdfjd() {
        return usdfjd;
    }

    @JsonProperty("USDFJD")
    public void setUsdfjd(Double usdfjd) {
        this.usdfjd = usdfjd;
    }

    @JsonProperty("USDFKP")
    public Double getUsdfkp() {
        return usdfkp;
    }

    @JsonProperty("USDFKP")
    public void setUsdfkp(Double usdfkp) {
        this.usdfkp = usdfkp;
    }

    @JsonProperty("USDGBP")
    public Double getUsdgbp() {
        return usdgbp;
    }

    @JsonProperty("USDGBP")
    public void setUsdgbp(Double usdgbp) {
        this.usdgbp = usdgbp;
    }

    @JsonProperty("USDGEL")
    public Double getUsdgel() {
        return usdgel;
    }

    @JsonProperty("USDGEL")
    public void setUsdgel(Double usdgel) {
        this.usdgel = usdgel;
    }

    @JsonProperty("USDGGP")
    public Double getUsdggp() {
        return usdggp;
    }

    @JsonProperty("USDGGP")
    public void setUsdggp(Double usdggp) {
        this.usdggp = usdggp;
    }

    @JsonProperty("USDGHS")
    public Double getUsdghs() {
        return usdghs;
    }

    @JsonProperty("USDGHS")
    public void setUsdghs(Double usdghs) {
        this.usdghs = usdghs;
    }

    @JsonProperty("USDGIP")
    public Double getUsdgip() {
        return usdgip;
    }

    @JsonProperty("USDGIP")
    public void setUsdgip(Double usdgip) {
        this.usdgip = usdgip;
    }

    @JsonProperty("USDGMD")
    public Double getUsdgmd() {
        return usdgmd;
    }

    @JsonProperty("USDGMD")
    public void setUsdgmd(Double usdgmd) {
        this.usdgmd = usdgmd;
    }

    @JsonProperty("USDGNF")
    public Double getUsdgnf() {
        return usdgnf;
    }

    @JsonProperty("USDGNF")
    public void setUsdgnf(Double usdgnf) {
        this.usdgnf = usdgnf;
    }

    @JsonProperty("USDGTQ")
    public Double getUsdgtq() {
        return usdgtq;
    }

    @JsonProperty("USDGTQ")
    public void setUsdgtq(Double usdgtq) {
        this.usdgtq = usdgtq;
    }

    @JsonProperty("USDGYD")
    public Double getUsdgyd() {
        return usdgyd;
    }

    @JsonProperty("USDGYD")
    public void setUsdgyd(Double usdgyd) {
        this.usdgyd = usdgyd;
    }

    @JsonProperty("USDHKD")
    public Double getUsdhkd() {
        return usdhkd;
    }

    @JsonProperty("USDHKD")
    public void setUsdhkd(Double usdhkd) {
        this.usdhkd = usdhkd;
    }

    @JsonProperty("USDHNL")
    public Double getUsdhnl() {
        return usdhnl;
    }

    @JsonProperty("USDHNL")
    public void setUsdhnl(Double usdhnl) {
        this.usdhnl = usdhnl;
    }

    @JsonProperty("USDHRK")
    public Double getUsdhrk() {
        return usdhrk;
    }

    @JsonProperty("USDHRK")
    public void setUsdhrk(Double usdhrk) {
        this.usdhrk = usdhrk;
    }

    @JsonProperty("USDHTG")
    public Double getUsdhtg() {
        return usdhtg;
    }

    @JsonProperty("USDHTG")
    public void setUsdhtg(Double usdhtg) {
        this.usdhtg = usdhtg;
    }

    @JsonProperty("USDHUF")
    public Double getUsdhuf() {
        return usdhuf;
    }

    @JsonProperty("USDHUF")
    public void setUsdhuf(Double usdhuf) {
        this.usdhuf = usdhuf;
    }

    @JsonProperty("USDIDR")
    public Double getUsdidr() {
        return usdidr;
    }

    @JsonProperty("USDIDR")
    public void setUsdidr(Double usdidr) {
        this.usdidr = usdidr;
    }

    @JsonProperty("USDILS")
    public Double getUsdils() {
        return usdils;
    }

    @JsonProperty("USDILS")
    public void setUsdils(Double usdils) {
        this.usdils = usdils;
    }

    @JsonProperty("USDIMP")
    public Double getUsdimp() {
        return usdimp;
    }

    @JsonProperty("USDIMP")
    public void setUsdimp(Double usdimp) {
        this.usdimp = usdimp;
    }

    @JsonProperty("USDINR")
    public Double getUsdinr() {
        return usdinr;
    }

    @JsonProperty("USDINR")
    public void setUsdinr(Double usdinr) {
        this.usdinr = usdinr;
    }

    @JsonProperty("USDIQD")
    public Double getUsdiqd() {
        return usdiqd;
    }

    @JsonProperty("USDIQD")
    public void setUsdiqd(Double usdiqd) {
        this.usdiqd = usdiqd;
    }

    @JsonProperty("USDIRR")
    public Double getUsdirr() {
        return usdirr;
    }

    @JsonProperty("USDIRR")
    public void setUsdirr(Double usdirr) {
        this.usdirr = usdirr;
    }

    @JsonProperty("USDISK")
    public Double getUsdisk() {
        return usdisk;
    }

    @JsonProperty("USDISK")
    public void setUsdisk(Double usdisk) {
        this.usdisk = usdisk;
    }

    @JsonProperty("USDJEP")
    public Double getUsdjep() {
        return usdjep;
    }

    @JsonProperty("USDJEP")
    public void setUsdjep(Double usdjep) {
        this.usdjep = usdjep;
    }

    @JsonProperty("USDJMD")
    public Double getUsdjmd() {
        return usdjmd;
    }

    @JsonProperty("USDJMD")
    public void setUsdjmd(Double usdjmd) {
        this.usdjmd = usdjmd;
    }

    @JsonProperty("USDJOD")
    public Double getUsdjod() {
        return usdjod;
    }

    @JsonProperty("USDJOD")
    public void setUsdjod(Double usdjod) {
        this.usdjod = usdjod;
    }

    @JsonProperty("USDJPY")
    public Double getUsdjpy() {
        return usdjpy;
    }

    @JsonProperty("USDJPY")
    public void setUsdjpy(Double usdjpy) {
        this.usdjpy = usdjpy;
    }

    @JsonProperty("USDKES")
    public Double getUsdkes() {
        return usdkes;
    }

    @JsonProperty("USDKES")
    public void setUsdkes(Double usdkes) {
        this.usdkes = usdkes;
    }

    @JsonProperty("USDKGS")
    public Double getUsdkgs() {
        return usdkgs;
    }

    @JsonProperty("USDKGS")
    public void setUsdkgs(Double usdkgs) {
        this.usdkgs = usdkgs;
    }

    @JsonProperty("USDKHR")
    public Double getUsdkhr() {
        return usdkhr;
    }

    @JsonProperty("USDKHR")
    public void setUsdkhr(Double usdkhr) {
        this.usdkhr = usdkhr;
    }

    @JsonProperty("USDKMF")
    public Double getUsdkmf() {
        return usdkmf;
    }

    @JsonProperty("USDKMF")
    public void setUsdkmf(Double usdkmf) {
        this.usdkmf = usdkmf;
    }

    @JsonProperty("USDKPW")
    public Double getUsdkpw() {
        return usdkpw;
    }

    @JsonProperty("USDKPW")
    public void setUsdkpw(Double usdkpw) {
        this.usdkpw = usdkpw;
    }

    @JsonProperty("USDKRW")
    public Double getUsdkrw() {
        return usdkrw;
    }

    @JsonProperty("USDKRW")
    public void setUsdkrw(Double usdkrw) {
        this.usdkrw = usdkrw;
    }

    @JsonProperty("USDKWD")
    public Double getUsdkwd() {
        return usdkwd;
    }

    @JsonProperty("USDKWD")
    public void setUsdkwd(Double usdkwd) {
        this.usdkwd = usdkwd;
    }

    @JsonProperty("USDKYD")
    public Double getUsdkyd() {
        return usdkyd;
    }

    @JsonProperty("USDKYD")
    public void setUsdkyd(Double usdkyd) {
        this.usdkyd = usdkyd;
    }

    @JsonProperty("USDKZT")
    public Double getUsdkzt() {
        return usdkzt;
    }

    @JsonProperty("USDKZT")
    public void setUsdkzt(Double usdkzt) {
        this.usdkzt = usdkzt;
    }

    @JsonProperty("USDLAK")
    public Double getUsdlak() {
        return usdlak;
    }

    @JsonProperty("USDLAK")
    public void setUsdlak(Double usdlak) {
        this.usdlak = usdlak;
    }

    @JsonProperty("USDLBP")
    public Double getUsdlbp() {
        return usdlbp;
    }

    @JsonProperty("USDLBP")
    public void setUsdlbp(Double usdlbp) {
        this.usdlbp = usdlbp;
    }

    @JsonProperty("USDLKR")
    public Double getUsdlkr() {
        return usdlkr;
    }

    @JsonProperty("USDLKR")
    public void setUsdlkr(Double usdlkr) {
        this.usdlkr = usdlkr;
    }

    @JsonProperty("USDLRD")
    public Double getUsdlrd() {
        return usdlrd;
    }

    @JsonProperty("USDLRD")
    public void setUsdlrd(Double usdlrd) {
        this.usdlrd = usdlrd;
    }

    @JsonProperty("USDLSL")
    public Double getUsdlsl() {
        return usdlsl;
    }

    @JsonProperty("USDLSL")
    public void setUsdlsl(Double usdlsl) {
        this.usdlsl = usdlsl;
    }

    @JsonProperty("USDLTL")
    public Double getUsdltl() {
        return usdltl;
    }

    @JsonProperty("USDLTL")
    public void setUsdltl(Double usdltl) {
        this.usdltl = usdltl;
    }

    @JsonProperty("USDLVL")
    public Double getUsdlvl() {
        return usdlvl;
    }

    @JsonProperty("USDLVL")
    public void setUsdlvl(Double usdlvl) {
        this.usdlvl = usdlvl;
    }

    @JsonProperty("USDLYD")
    public Double getUsdlyd() {
        return usdlyd;
    }

    @JsonProperty("USDLYD")
    public void setUsdlyd(Double usdlyd) {
        this.usdlyd = usdlyd;
    }

    @JsonProperty("USDMAD")
    public Double getUsdmad() {
        return usdmad;
    }

    @JsonProperty("USDMAD")
    public void setUsdmad(Double usdmad) {
        this.usdmad = usdmad;
    }

    @JsonProperty("USDMDL")
    public Double getUsdmdl() {
        return usdmdl;
    }

    @JsonProperty("USDMDL")
    public void setUsdmdl(Double usdmdl) {
        this.usdmdl = usdmdl;
    }

    @JsonProperty("USDMGA")
    public Double getUsdmga() {
        return usdmga;
    }

    @JsonProperty("USDMGA")
    public void setUsdmga(Double usdmga) {
        this.usdmga = usdmga;
    }

    @JsonProperty("USDMKD")
    public Double getUsdmkd() {
        return usdmkd;
    }

    @JsonProperty("USDMKD")
    public void setUsdmkd(Double usdmkd) {
        this.usdmkd = usdmkd;
    }

    @JsonProperty("USDMMK")
    public Double getUsdmmk() {
        return usdmmk;
    }

    @JsonProperty("USDMMK")
    public void setUsdmmk(Double usdmmk) {
        this.usdmmk = usdmmk;
    }

    @JsonProperty("USDMNT")
    public Double getUsdmnt() {
        return usdmnt;
    }

    @JsonProperty("USDMNT")
    public void setUsdmnt(Double usdmnt) {
        this.usdmnt = usdmnt;
    }

    @JsonProperty("USDMOP")
    public Double getUsdmop() {
        return usdmop;
    }

    @JsonProperty("USDMOP")
    public void setUsdmop(Double usdmop) {
        this.usdmop = usdmop;
    }

    @JsonProperty("USDMRO")
    public Double getUsdmro() {
        return usdmro;
    }

    @JsonProperty("USDMRO")
    public void setUsdmro(Double usdmro) {
        this.usdmro = usdmro;
    }

    @JsonProperty("USDMUR")
    public Double getUsdmur() {
        return usdmur;
    }

    @JsonProperty("USDMUR")
    public void setUsdmur(Double usdmur) {
        this.usdmur = usdmur;
    }

    @JsonProperty("USDMVR")
    public Double getUsdmvr() {
        return usdmvr;
    }

    @JsonProperty("USDMVR")
    public void setUsdmvr(Double usdmvr) {
        this.usdmvr = usdmvr;
    }

    @JsonProperty("USDMWK")
    public Double getUsdmwk() {
        return usdmwk;
    }

    @JsonProperty("USDMWK")
    public void setUsdmwk(Double usdmwk) {
        this.usdmwk = usdmwk;
    }

    @JsonProperty("USDMXN")
    public Double getUsdmxn() {
        return usdmxn;
    }

    @JsonProperty("USDMXN")
    public void setUsdmxn(Double usdmxn) {
        this.usdmxn = usdmxn;
    }

    @JsonProperty("USDMYR")
    public Double getUsdmyr() {
        return usdmyr;
    }

    @JsonProperty("USDMYR")
    public void setUsdmyr(Double usdmyr) {
        this.usdmyr = usdmyr;
    }

    @JsonProperty("USDMZN")
    public Double getUsdmzn() {
        return usdmzn;
    }

    @JsonProperty("USDMZN")
    public void setUsdmzn(Double usdmzn) {
        this.usdmzn = usdmzn;
    }

    @JsonProperty("USDNAD")
    public Double getUsdnad() {
        return usdnad;
    }

    @JsonProperty("USDNAD")
    public void setUsdnad(Double usdnad) {
        this.usdnad = usdnad;
    }

    @JsonProperty("USDNGN")
    public Double getUsdngn() {
        return usdngn;
    }

    @JsonProperty("USDNGN")
    public void setUsdngn(Double usdngn) {
        this.usdngn = usdngn;
    }

    @JsonProperty("USDNIO")
    public Double getUsdnio() {
        return usdnio;
    }

    @JsonProperty("USDNIO")
    public void setUsdnio(Double usdnio) {
        this.usdnio = usdnio;
    }

    @JsonProperty("USDNOK")
    public Double getUsdnok() {
        return usdnok;
    }

    @JsonProperty("USDNOK")
    public void setUsdnok(Double usdnok) {
        this.usdnok = usdnok;
    }

    @JsonProperty("USDNPR")
    public Double getUsdnpr() {
        return usdnpr;
    }

    @JsonProperty("USDNPR")
    public void setUsdnpr(Double usdnpr) {
        this.usdnpr = usdnpr;
    }

    @JsonProperty("USDNZD")
    public Double getUsdnzd() {
        return usdnzd;
    }

    @JsonProperty("USDNZD")
    public void setUsdnzd(Double usdnzd) {
        this.usdnzd = usdnzd;
    }

    @JsonProperty("USDOMR")
    public Double getUsdomr() {
        return usdomr;
    }

    @JsonProperty("USDOMR")
    public void setUsdomr(Double usdomr) {
        this.usdomr = usdomr;
    }

    @JsonProperty("USDPAB")
    public Double getUsdpab() {
        return usdpab;
    }

    @JsonProperty("USDPAB")
    public void setUsdpab(Double usdpab) {
        this.usdpab = usdpab;
    }

    @JsonProperty("USDPEN")
    public Double getUsdpen() {
        return usdpen;
    }

    @JsonProperty("USDPEN")
    public void setUsdpen(Double usdpen) {
        this.usdpen = usdpen;
    }

    @JsonProperty("USDPGK")
    public Double getUsdpgk() {
        return usdpgk;
    }

    @JsonProperty("USDPGK")
    public void setUsdpgk(Double usdpgk) {
        this.usdpgk = usdpgk;
    }

    @JsonProperty("USDPHP")
    public Double getUsdphp() {
        return usdphp;
    }

    @JsonProperty("USDPHP")
    public void setUsdphp(Double usdphp) {
        this.usdphp = usdphp;
    }

    @JsonProperty("USDPKR")
    public Double getUsdpkr() {
        return usdpkr;
    }

    @JsonProperty("USDPKR")
    public void setUsdpkr(Double usdpkr) {
        this.usdpkr = usdpkr;
    }

    @JsonProperty("USDPLN")
    public Double getUsdpln() {
        return usdpln;
    }

    @JsonProperty("USDPLN")
    public void setUsdpln(Double usdpln) {
        this.usdpln = usdpln;
    }

    @JsonProperty("USDPYG")
    public Double getUsdpyg() {
        return usdpyg;
    }

    @JsonProperty("USDPYG")
    public void setUsdpyg(Double usdpyg) {
        this.usdpyg = usdpyg;
    }

    @JsonProperty("USDQAR")
    public Double getUsdqar() {
        return usdqar;
    }

    @JsonProperty("USDQAR")
    public void setUsdqar(Double usdqar) {
        this.usdqar = usdqar;
    }

    @JsonProperty("USDRON")
    public Double getUsdron() {
        return usdron;
    }

    @JsonProperty("USDRON")
    public void setUsdron(Double usdron) {
        this.usdron = usdron;
    }

    @JsonProperty("USDRSD")
    public Double getUsdrsd() {
        return usdrsd;
    }

    @JsonProperty("USDRSD")
    public void setUsdrsd(Double usdrsd) {
        this.usdrsd = usdrsd;
    }

    @JsonProperty("USDRUB")
    public Double getUsdrub() {
        return usdrub;
    }

    @JsonProperty("USDRUB")
    public void setUsdrub(Double usdrub) {
        this.usdrub = usdrub;
    }

    @JsonProperty("USDRWF")
    public Double getUsdrwf() {
        return usdrwf;
    }

    @JsonProperty("USDRWF")
    public void setUsdrwf(Double usdrwf) {
        this.usdrwf = usdrwf;
    }

    @JsonProperty("USDSAR")
    public Double getUsdsar() {
        return usdsar;
    }

    @JsonProperty("USDSAR")
    public void setUsdsar(Double usdsar) {
        this.usdsar = usdsar;
    }

    @JsonProperty("USDSBD")
    public Double getUsdsbd() {
        return usdsbd;
    }

    @JsonProperty("USDSBD")
    public void setUsdsbd(Double usdsbd) {
        this.usdsbd = usdsbd;
    }

    @JsonProperty("USDSCR")
    public Double getUsdscr() {
        return usdscr;
    }

    @JsonProperty("USDSCR")
    public void setUsdscr(Double usdscr) {
        this.usdscr = usdscr;
    }

    @JsonProperty("USDSDG")
    public Double getUsdsdg() {
        return usdsdg;
    }

    @JsonProperty("USDSDG")
    public void setUsdsdg(Double usdsdg) {
        this.usdsdg = usdsdg;
    }

    @JsonProperty("USDSEK")
    public Double getUsdsek() {
        return usdsek;
    }

    @JsonProperty("USDSEK")
    public void setUsdsek(Double usdsek) {
        this.usdsek = usdsek;
    }

    @JsonProperty("USDSGD")
    public Double getUsdsgd() {
        return usdsgd;
    }

    @JsonProperty("USDSGD")
    public void setUsdsgd(Double usdsgd) {
        this.usdsgd = usdsgd;
    }

    @JsonProperty("USDSHP")
    public Double getUsdshp() {
        return usdshp;
    }

    @JsonProperty("USDSHP")
    public void setUsdshp(Double usdshp) {
        this.usdshp = usdshp;
    }

    @JsonProperty("USDSLE")
    public Double getUsdsle() {
        return usdsle;
    }

    @JsonProperty("USDSLE")
    public void setUsdsle(Double usdsle) {
        this.usdsle = usdsle;
    }

    @JsonProperty("USDSLL")
    public Double getUsdsll() {
        return usdsll;
    }

    @JsonProperty("USDSLL")
    public void setUsdsll(Double usdsll) {
        this.usdsll = usdsll;
    }

    @JsonProperty("USDSOS")
    public Double getUsdsos() {
        return usdsos;
    }

    @JsonProperty("USDSOS")
    public void setUsdsos(Double usdsos) {
        this.usdsos = usdsos;
    }

    @JsonProperty("USDSRD")
    public Double getUsdsrd() {
        return usdsrd;
    }

    @JsonProperty("USDSRD")
    public void setUsdsrd(Double usdsrd) {
        this.usdsrd = usdsrd;
    }

    @JsonProperty("USDSTD")
    public Double getUsdstd() {
        return usdstd;
    }

    @JsonProperty("USDSTD")
    public void setUsdstd(Double usdstd) {
        this.usdstd = usdstd;
    }

    @JsonProperty("USDSYP")
    public Double getUsdsyp() {
        return usdsyp;
    }

    @JsonProperty("USDSYP")
    public void setUsdsyp(Double usdsyp) {
        this.usdsyp = usdsyp;
    }

    @JsonProperty("USDSZL")
    public Double getUsdszl() {
        return usdszl;
    }

    @JsonProperty("USDSZL")
    public void setUsdszl(Double usdszl) {
        this.usdszl = usdszl;
    }

    @JsonProperty("USDTHB")
    public Double getUsdthb() {
        return usdthb;
    }

    @JsonProperty("USDTHB")
    public void setUsdthb(Double usdthb) {
        this.usdthb = usdthb;
    }

    @JsonProperty("USDTJS")
    public Double getUsdtjs() {
        return usdtjs;
    }

    @JsonProperty("USDTJS")
    public void setUsdtjs(Double usdtjs) {
        this.usdtjs = usdtjs;
    }

    @JsonProperty("USDTMT")
    public Double getUsdtmt() {
        return usdtmt;
    }

    @JsonProperty("USDTMT")
    public void setUsdtmt(Double usdtmt) {
        this.usdtmt = usdtmt;
    }

    @JsonProperty("USDTND")
    public Double getUsdtnd() {
        return usdtnd;
    }

    @JsonProperty("USDTND")
    public void setUsdtnd(Double usdtnd) {
        this.usdtnd = usdtnd;
    }

    @JsonProperty("USDTOP")
    public Double getUsdtop() {
        return usdtop;
    }

    @JsonProperty("USDTOP")
    public void setUsdtop(Double usdtop) {
        this.usdtop = usdtop;
    }

    @JsonProperty("USDTRY")
    public Double getUsdtry() {
        return usdtry;
    }

    @JsonProperty("USDTRY")
    public void setUsdtry(Double usdtry) {
        this.usdtry = usdtry;
    }

    @JsonProperty("USDTTD")
    public Double getUsdttd() {
        return usdttd;
    }

    @JsonProperty("USDTTD")
    public void setUsdttd(Double usdttd) {
        this.usdttd = usdttd;
    }

    @JsonProperty("USDTWD")
    public Double getUsdtwd() {
        return usdtwd;
    }

    @JsonProperty("USDTWD")
    public void setUsdtwd(Double usdtwd) {
        this.usdtwd = usdtwd;
    }

    @JsonProperty("USDTZS")
    public Double getUsdtzs() {
        return usdtzs;
    }

    @JsonProperty("USDTZS")
    public void setUsdtzs(Double usdtzs) {
        this.usdtzs = usdtzs;
    }

    @JsonProperty("USDUAH")
    public Double getUsduah() {
        return usduah;
    }

    @JsonProperty("USDUAH")
    public void setUsduah(Double usduah) {
        this.usduah = usduah;
    }

    @JsonProperty("USDUGX")
    public Double getUsdugx() {
        return usdugx;
    }

    @JsonProperty("USDUGX")
    public void setUsdugx(Double usdugx) {
        this.usdugx = usdugx;
    }

    @JsonProperty("USDUYU")
    public Double getUsduyu() {
        return usduyu;
    }

    @JsonProperty("USDUYU")
    public void setUsduyu(Double usduyu) {
        this.usduyu = usduyu;
    }

    @JsonProperty("USDUZS")
    public Double getUsduzs() {
        return usduzs;
    }

    @JsonProperty("USDUZS")
    public void setUsduzs(Double usduzs) {
        this.usduzs = usduzs;
    }

    @JsonProperty("USDVEF")
    public Double getUsdvef() {
        return usdvef;
    }

    @JsonProperty("USDVEF")
    public void setUsdvef(Double usdvef) {
        this.usdvef = usdvef;
    }

    @JsonProperty("USDVES")
    public Double getUsdves() {
        return usdves;
    }

    @JsonProperty("USDVES")
    public void setUsdves(Double usdves) {
        this.usdves = usdves;
    }

    @JsonProperty("USDVND")
    public Integer getUsdvnd() {
        return usdvnd;
    }

    @JsonProperty("USDVND")
    public void setUsdvnd(Integer usdvnd) {
        this.usdvnd = usdvnd;
    }

    @JsonProperty("USDVUV")
    public Double getUsdvuv() {
        return usdvuv;
    }

    @JsonProperty("USDVUV")
    public void setUsdvuv(Double usdvuv) {
        this.usdvuv = usdvuv;
    }

    @JsonProperty("USDWST")
    public Double getUsdwst() {
        return usdwst;
    }

    @JsonProperty("USDWST")
    public void setUsdwst(Double usdwst) {
        this.usdwst = usdwst;
    }

    @JsonProperty("USDXAF")
    public Double getUsdxaf() {
        return usdxaf;
    }

    @JsonProperty("USDXAF")
    public void setUsdxaf(Double usdxaf) {
        this.usdxaf = usdxaf;
    }

    @JsonProperty("USDXAG")
    public Double getUsdxag() {
        return usdxag;
    }

    @JsonProperty("USDXAG")
    public void setUsdxag(Double usdxag) {
        this.usdxag = usdxag;
    }

    @JsonProperty("USDXAU")
    public Double getUsdxau() {
        return usdxau;
    }

    @JsonProperty("USDXAU")
    public void setUsdxau(Double usdxau) {
        this.usdxau = usdxau;
    }

    @JsonProperty("USDXCD")
    public Double getUsdxcd() {
        return usdxcd;
    }

    @JsonProperty("USDXCD")
    public void setUsdxcd(Double usdxcd) {
        this.usdxcd = usdxcd;
    }

    @JsonProperty("USDXDR")
    public Double getUsdxdr() {
        return usdxdr;
    }

    @JsonProperty("USDXDR")
    public void setUsdxdr(Double usdxdr) {
        this.usdxdr = usdxdr;
    }

    @JsonProperty("USDXOF")
    public Double getUsdxof() {
        return usdxof;
    }

    @JsonProperty("USDXOF")
    public void setUsdxof(Double usdxof) {
        this.usdxof = usdxof;
    }

    @JsonProperty("USDXPF")
    public Double getUsdxpf() {
        return usdxpf;
    }

    @JsonProperty("USDXPF")
    public void setUsdxpf(Double usdxpf) {
        this.usdxpf = usdxpf;
    }

    @JsonProperty("USDYER")
    public Double getUsdyer() {
        return usdyer;
    }

    @JsonProperty("USDYER")
    public void setUsdyer(Double usdyer) {
        this.usdyer = usdyer;
    }

    @JsonProperty("USDZAR")
    public Double getUsdzar() {
        return usdzar;
    }

    @JsonProperty("USDZAR")
    public void setUsdzar(Double usdzar) {
        this.usdzar = usdzar;
    }

    @JsonProperty("USDZMK")
    public Double getUsdzmk() {
        return usdzmk;
    }

    @JsonProperty("USDZMK")
    public void setUsdzmk(Double usdzmk) {
        this.usdzmk = usdzmk;
    }

    @JsonProperty("USDZMW")
    public Double getUsdzmw() {
        return usdzmw;
    }

    @JsonProperty("USDZMW")
    public void setUsdzmw(Double usdzmw) {
        this.usdzmw = usdzmw;
    }

    @JsonProperty("USDZWL")
    public Double getUsdzwl() {
        return usdzwl;
    }

    @JsonProperty("USDZWL")
    public void setUsdzwl(Double usdzwl) {
        this.usdzwl = usdzwl;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
