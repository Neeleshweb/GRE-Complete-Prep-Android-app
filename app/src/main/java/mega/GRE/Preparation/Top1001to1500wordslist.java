package mega.GRE.Preparation;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Top1001to1500wordslist extends ListActivity {

    private TextView text;

    private List<String> listValues;



    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_top1001to1500wordslist);



        text = (TextView) findViewById(R.id.first3);



        listValues = new ArrayList<String>();

        listValues.add("RIFE: abundant, current");
        listValues.add("STOKE: stir up a fire");

        listValues.add("DELIBERATE: consider, think carefully");
        listValues.add("MEANDER: wind or turn in its course");
        listValues.add("CHRONIC: long established");
        listValues.add("ATAVISM: throwback");

        listValues.add("ARTIFICE: deception, trickery");
        listValues.add("BLOWHARD: talkative, booster");
        listValues.add("CONGRUENT: in argument, corresponding");
        listValues.add("BRAGGART: booster");

        listValues.add("ASSAY: alnalyze, evaluate");
        listValues.add("SLEW: large quantity or number");
        listValues.add("PATRONIZE: support, act superior toward");
        listValues.add("HIATUS: gap");

        listValues.add("ANTIQUATED: obsolete, outdated");
        listValues.add("ZENITH: summit");
        listValues.add("RAUCOUS: harsh and shrill");
        listValues.add("NONDESCRIPT: undistinctive, ordinary");

        listValues.add("WILLFUL: intentional");
        listValues.add("QUARANTINE: isolation of person");
        listValues.add("NEGLIGENCE: neglect or avoid");
        listValues.add("ANECDOTE: short account of an amusing or interesting event");

        listValues.add("VITAL: critical");
        listValues.add("UNPREPOSSESSING: unattractive");
        listValues.add("PROLETARIAN: member of the working class");
        listValues.add("USURY: lending money at illegal rates of interest");

        listValues.add("NAVIGABLE: wide and deep enought o allow ships to pass through");
        listValues.add("PERDITION: complete ruin");
        listValues.add("INTERREGNUM: period between two reigns");
        listValues.add("ETYMOLOGY: study of word parts");

        listValues.add("BULWARK: person who defends");
        listValues.add("EXPIATE: make amends for");
        listValues.add("LANGUISH: lose strength");
        listValues.add("HAPLESS: unfortunate");

        listValues.add("CLEMENCY: mildness");
        listValues.add("QUARRY: victim");
        listValues.add("MISCONSTRUE: misjudge");
        listValues.add("HEDONIST: one who believes that pleasure is the role aim in life");

        listValues.add("CHIMERICAL: highly unrealistic");
        listValues.add("WAIVE: give up temporarily");
        listValues.add("QUAGMIRE: soft");
        listValues.add("MERCENARY: motivated solely by money or gain");

        listValues.add("UPROARIOUS: marked by commotion");
        listValues.add("PHSYCOSIS: mental disorder");
        listValues.add("MALEFACTOR: criminal");
        listValues.add("CARPING: petty criticism, fault-finding");

        listValues.add("SEEMLY: proper, appropriate");
        listValues.add("RESPITE: interval of relief");
        listValues.add("PORTABLE: suitable for drinking");
        listValues.add("SCAPEGOAT: someone who bears the blame for others");

        listValues.add("JEOPARDIZE: endanger");
        listValues.add("PERIPHERAL: marginal");
        listValues.add("HORTATORY: encouraging");
        listValues.add("DEPRAVITY: extreme corruption");

        listValues.add("CORPULENT: very fat");
        listValues.add("DIORAMA: life size");
        listValues.add("IRONIC: occurring in an unexpected and contrary manner");
        listValues.add("HAMPER: obstruct");

        listValues.add("DECOY: lure or bait");
        listValues.add("PRECIPITOUS: steap");
        listValues.add("IRREPROACHABLE: impeccable");
        listValues.add("DYNAMIC: energetic");

        listValues.add("BLIGHTED: destroyed");
        listValues.add("WANE: decrease in size or strength");
        listValues.add("PARTIALITY: bias, inclination");
        listValues.add("GERONTOCRACY: government ruled by old people");

        listValues.add("VIGNETTE: picture, short or brief film scene");
        listValues.add("PANACEA: remedy for all diseases");
        listValues.add("EXCEPTIONABLE: objectionable");
        listValues.add("BESTIAL: beastlike");

        listValues.add("SERENDIPITY: accidental good fortune or luck");
        listValues.add("REMORSE: guilt");
        listValues.add("LEGEND: explanatory list of symbols on a map");
        listValues.add("SATE: satisfy to full");

        listValues.add("EMANCIPATE: set free");
        listValues.add("JARGON: language and by a special group");
        listValues.add("EGREGIOUS: notorious");
        listValues.add("CONSENSUS: general agreement");

        listValues.add("CHOLERIC: hot-tempered");
        listValues.add("CRINGE: shrink back");
        listValues.add("ELUSIVE: hard to grasp");
        listValues.add("DISSIDENT: rebellious");

        listValues.add("CONSECRATE: dedicate");
        listValues.add("SUSCEPTIBLE: easily influenced");
        listValues.add("PLAUSIBLE: specious, misleading");
        listValues.add("LIMPID: clear");

        listValues.add("APOCRYPHAL: untrue, made up");
        listValues.add("ZANY: crazy, comic");
        listValues.add("SOLACE; comfort in trouble");
        listValues.add("PLACEBO: harmless substance");

        listValues.add("VITRIOLIC: corrosive");
        listValues.add("SKIRMISH: minor light");
        listValues.add("PAPYRUS: ancient paper made from stem of papyrus plant");
        listValues.add("ADVERSITY: poverty");

        listValues.add("VIRTUOSO: highly skilled artist");
        listValues.add("TRILOGY: group of three works");
        listValues.add("RENOWN: fame");
        listValues.add("VENIAL: forgivable");

        listValues.add("NETTLE: annoy");
        listValues.add("PREROGATIVE: privilege");
        listValues.add("MARSUPIAL: one of a family of mammals that nurse their offspring in a pouch");
        listValues.add("INCANTATION: singing or chanting of magic spells");

        listValues.add("IMPIOUS: irreverent");
        listValues.add("INFAMOUS: notoriously bad");
        listValues.add("MUNIFICENT: very generous");
        listValues.add("LAX: careless");

        listValues.add("IMPROPRIETY: improperness");
        listValues.add("SLIGHT: insult to one's dignity");
        listValues.add("PRECEDENT: proceeding in time");
        listValues.add("LACERATION: torn");

        listValues.add("DALLY: flirt, procrastinate");
        listValues.add("ZEAL: eager enthusiasm");
        listValues.add("SEMINARY: secondary school");
        listValues.add("OBLITERATE: destroy");

        listValues.add("WRY: twisted");
        listValues.add("RUE: regret");
        listValues.add("NULLIFY: to make invalid or ineffective");
        listValues.add("BRUSQUE: blunt, abrupt");

        listValues.add("UNSURP: seize another's power or rank");
        listValues.add("TUMULT: commotion, riot, noise");
        listValues.add("PREEMINENT: outstanding");
        listValues.add("UNEQUIVOCAL: plain, obvious");

        listValues.add("NOVICE: beginner");
        listValues.add("PREDICAMENT: dilemma");
        listValues.add("MUTINOUS: unruly, rebellious");
        listValues.add("GENRE: particular variety of art or literature");

        listValues.add("DEFOLIATE: destroy leaves");
        listValues.add("HISTRIONIC: theatrical");
        listValues.add("ILLUSORY: not real");
        listValues.add("FEASIBLE: practical");

        listValues.add("SOMNAMBULIST:sleepwalker");
        listValues.add("INIQUITOUS: wicked, immortal");
        listValues.add("EXPEDITE: hasten, very quick");
        listValues.add("ANTHOLOGY: book of literary selections by various authors");

        listValues.add("WHELP: young wolf, dog, tiger");
        listValues.add("PARRY: deflect");
        listValues.add("INGRATE: ungrateful person");
        listValues.add("UNPRECEDENTED: unparalleled");

        listValues.add("ORNATE: excessively decorated");
        listValues.add("HOARY: white hair with age");
        listValues.add("AMORPHOUS: formless, lacking shape");
        listValues.add("TRUNCATE: cut the top off");

        listValues.add("SYLLOGISM: a logical formula consisting of major premise");
        listValues.add("NOTORIETY: disrepute, ill-flame");
        listValues.add("TOME: large-volume");
        listValues.add("GAVEL: hammer like tool");

        listValues.add("LAMPOON: ridicule");
        listValues.add("FORTITUDE: bravery, courage");
        listValues.add("CYNICAL: skeptical of human motives");
        listValues.add("BELEAGUER: attack");

        listValues.add("DELETERIOUS: harmful");
        listValues.add("GAMBIT: opening in chess in which a piece is satisfied");
        listValues.add("EMBROIL: throw into confusion");
        listValues.add("CELERITY: speed, rapidity");

        listValues.add("REDOLENT: fragrant, odorous");
        listValues.add("FRAUDULENT: cheating");
        listValues.add("CONDESCEND: to think you are more intelligent or better than other people");
        listValues.add("BOURGEOIS: middle class");

        listValues.add("WISPY: thin, slight");
        listValues.add("POSEUR: person who pretends to be elegant to impress others");
        listValues.add("FLIPPANT: lacking proper seriousness");
        listValues.add("UNFROCK: to strip a priest or minister of church authority");

        listValues.add("OVERT: open to view");
        listValues.add("FLAUNT: display ostentatiously");
        listValues.add("BANE: cause of ruin, curse");
        listValues.add("TRINKET: bauble, not valuable jewellery");

        listValues.add("SMELT: melt or blend areas");
        listValues.add("INERRANCY: not wrong or one who never makes mistakes");
        listValues.add("TANGIBLE: real, able to be touched");
        listValues.add("EXEMPLARY: outstanding");

        listValues.add("GUSTATORY: affecting the sense of taste");
        listValues.add("CORRUGATED: wrinkled");
        listValues.add("CENTRIFUGE: machine that separates substances by whirling them");
        listValues.add("CARDINAL: chief");

        listValues.add("CEREBRAL: relating to the brain or intellect");
        listValues.add("DISAPPROBATIOR: disappeared");
        listValues.add("CLANDESTINE: secret");
        listValues.add("CAUCUS: private meeting of members of a party to select officers");

        listValues.add("RESPLENDENT: dazzling");
        listValues.add("MENAGERIE: collection of wild animals");
        listValues.add("DOFF: take off");
        listValues.add("CARTOGRAPHER: map-maker");

        listValues.add("STRATAGEM: clever trick");
        listValues.add("POSTHUMOUS: after death");
        listValues.add("MANNERED: affected");
        listValues.add("STANZA: division of a poem");

        listValues.add("PORTEND: foretell, presage");
        listValues.add("LUSCIOUS: pleasing to taste or smell");
        listValues.add("ADROIT: skillful");
        listValues.add("SINECURE: well paid position with little responsibility");

        listValues.add("ROSTER: list");
        listValues.add("OBSOLETE: outmoded");
        listValues.add("SALLOW: yellowish");
        listValues.add("IMPARTIAL: not biased");

        listValues.add("NIGGARDLY: meanly stingy");
        listValues.add("FICKLE: changeable");
        listValues.add("DEFUNCT: dead");
        listValues.add("CERTITUDE: certainty");

        listValues.add("DISPARITY: difference");
        listValues.add("BENEFICIARY: person entitled to benefit");
        listValues.add("DISPATCH: prompt execution");
        listValues.add("CONCISE: precise");

        listValues.add("RESONANT: resounding");
        listValues.add("JURISPRUDENCE: science of law");
        listValues.add("DEGRADATION: humiliation");
        listValues.add("ANALGESIC: cause insensitivity to pain");

        listValues.add("VICISSITUDE: change of fortune");
        listValues.add("POTENT: powerful");
        listValues.add("GALLEON: large sailing ship");
        listValues.add("STRINGENT: binding");

        listValues.add("POSTERITY: future generations");
        listValues.add("EXTRANEOUS: not essential");
        listValues.add("ADVOCATE: urge, plead for");
        listValues.add("STAGNANT: motionless" );

        listValues.add("SANGUINARY: bloody");
        listValues.add("MALADY: illness");
        listValues.add("SEQUESTER: isolate");
        listValues.add("EPICURE: someone who enjoys food and drink");

        listValues.add("LARGESS: generous gift");
        listValues.add("DIURNAL: daily");
        listValues.add("CAULK: to make water tight");
        listValues.add("ARTISAN: a manually skilled worker");

        listValues.add("CHAUVINIST: blindly devoted patriot");
        listValues.add("EFFUSIVE: showing good feeling in excited way");
        listValues.add("COTERIE: group that meets racially");
        listValues.add("BREVITY: conciseness");

        listValues.add("STEREOTYPE: fixed and unvarying representation");
        listValues.add("PILLAGE: plunder");
        listValues.add("INTERMINABLE: endless");
        listValues.add("ALLAY: calm, pacify");

        listValues.add("WISTFUL: sadly pensive, become sad while remebering the past");
        listValues.add("STAID: serious");
        listValues.add("PARCHED: extremely dry");
        listValues.add("WAX: increase, grow");

        listValues.add("RUNIC: mysterious");
        listValues.add("PALLID: pale");
        listValues.add("ABSCISSION: cutting off");
        listValues.add("VOLUMINOUS: bulky");

        listValues.add("TEDIUM: boredom");
        listValues.add("PROTEAN: versatile, flexible");
        listValues.add("VERISIMILAR: probable or likely");
        listValues.add("OUST: expel");

        listValues.add("PLACID: peaceful, calm");
        listValues.add("INTERMITTENT: periodic");
        listValues.add("GRATUITOUS: given freely");
        listValues.add("CARRION: rotting flesh of a dead body");

        listValues.add("INEXORABLE: unyielding");
        listValues.add("NATTY: neatly or smartly dressed");
        listValues.add("INNATE: inborn");
        listValues.add("ELUCIDATE: explain");

        listValues.add("PRAGMATIC: practical person");
        listValues.add("MALEDICTION: curse");
        listValues.add("FALLOW: uncultivated");
        listValues.add("BEFUDDLE: confuse thoroughly");

        listValues.add("UNSCATHED: unharmed");
        listValues.add("PINNACLE: peak");
        listValues.add("LOFTY: very high");
        listValues.add("TACTILE: sense of tough");

        listValues.add("PERTINENT: suitable");
        listValues.add("KINDLE: start a fire");
        listValues.add("ASYLUM: protection");
        listValues.add("SUBLIMINAL: below the threshold");

        listValues.add("PREDECESSOR: former occupant of a post");
        listValues.add("OGLE: make eyes out");
        listValues.add("SINEWY: tough");
        listValues.add("HEADSTRONG: stubborn, willful");

        listValues.add("MINION: a servile dependent");
        listValues.add("GAMBOL: skip about");
        listValues.add("CATHARSIS: cleansing of any passage of the body");
        listValues.add("BEQUEATH: leave to someone by means of will");

        listValues.add("CENSORIOUS: critical, criticizing");
        listValues.add("GAUNT: lean and angular");
        listValues.add("COGNITIVE: having to do with knowing or perceiving related to the mental processes");
        listValues.add("CAPACIOUS: spacious");

        listValues.add("PAROCHIAL: narrow in outlook");
        listValues.add("LIVID: lead colored, black and blue");
        listValues.add("CONVENTIONAL: ordinary");
        listValues.add("BALM: something that relieves pain");

        listValues.add("UNWITTING: unintentional");
        listValues.add("PARADOX: statement that looks fake");
        listValues.add("LARCENY: theft");
        listValues.add("REBUTTAL: response with contary evidence");

        listValues.add("PALPABLE: tangible");
        listValues.add("HAUGHTINESS: pride, arrogance");
        listValues.add("AMBULATORY: able to walk");
        listValues.add("RAMBLE: wander aimlessly");

        listValues.add("POSTULATE: self-evident truth");
        listValues.add("MOMENTOUS: very important ");
        listValues.add("PROCRASTINATE: postpone, delay");
        listValues.add("GERMINAL: creative");

        listValues.add("MIRE: entangle");
        listValues.add("FLAGRANT: wicked");
        listValues.add("BILLOWING: swelling out in waves");
        listValues.add("BARD: poet");

        listValues.add("CIRCUMUENT: outwit");
        listValues.add("FRIEZE: ornamental band on a wall");
        listValues.add("COLLATE: arrange in order");
        listValues.add("BEGRUDGE: resent, annoyed");

        listValues.add("PROMINENT: notable, famous");
        listValues.add("INEVITABLE: unavoidable");
        listValues.add("CIRCUMLOCUTION: indirect or roundabout expression");
        listValues.add("ANTAGONISM: hostility");

        listValues.add("VAPID: dull, insipid");
        listValues.add("PARANOIA: psychosis marked by delusions");
        listValues.add("INCOHERENT: illogical");
        listValues.add("VACUOUS: empty, leacking in ideas");

        listValues.add("OVERWROUGHT: extremely agigated");
        listValues.add("EXPATRIATE: exile, someone who has withdrwan from his native land");
        listValues.add("ACROPHOBIA: fear of heights");
        listValues.add("SOLILOQUY: talking to oneself");

        listValues.add("RESIGNATION: statement of quitting a job");
        listValues.add("NONCHALANCE: lack of concern");
        listValues.add("SCRUPLOUS: extremely thourough ");
        listValues.add("DENOUNCE: criticize");

        listValues.add("MARRED: damaged");
        listValues.add("COMMANDEER: to draft for miliatary porposes");
        listValues.add("AUGMENT: increase, add to");
        listValues.add("APPOSITE: appropriate");

        listValues.add("BASTION: strong hold");
        listValues.add("CONCATENATE: link as a chain");
        listValues.add("CAVALCADE: parade");
        listValues.add("ARCANE: secret");

        listValues.add("RENT: rip, split");
        listValues.add("OLFACTORY: concerning the sense of smell");
        listValues.add("GARISH: over bright in color");
        listValues.add("ARMADA: fleet of warships");

        listValues.add("VERTIGO: severe dizziness");
        listValues.add("QUAINT: old fashioned");
        listValues.add("MUSE: ponder");
        listValues.add("TOTTER: move unsteadily");

        listValues.add("PURCHASE: firm grasp");
        listValues.add("MINUTIAE: petty details, very small details");
        listValues.add("AMASS: collect");
        listValues.add("TALISMAN: charm");

        listValues.add("SCRUTINIZE: examine closely and critically");
        listValues.add("PATHOS: pity, tender sorrow");
        listValues.add("STATUTE: law enacted by the legislature");
        listValues.add("MILIEU: environment, means of expression");

        listValues.add("ORTHODOX: traditional");
        listValues.add("IGNOMINY: deep disgrace");
        listValues.add("ERRANT: wandering");
        listValues.add("DEXTEROUS: skillful");

        listValues.add("EXEMPLIFY: show by example");
        listValues.add("LABYRINTH: maze");
        listValues.add("GALL: bitterness");
        listValues.add("ELLIPSIS: omission of words from a text");

        listValues.add("RUMINATE: chew over and over, think carefully");
        listValues.add("PLAUDIT: enthusiastic approval");
        listValues.add("HALLOWED: blessed");
        listValues.add("DETRIMENTAL: harmful");

        listValues.add("TUTELARY: protective");
        listValues.add("REPRIEVE: temporary relieve");
        listValues.add("MORIBUND: dying");
        listValues.add("TORRID: passionate");

        listValues.add("REDRESS: remedy");
        listValues.add("MASOCHIST: person who enjoys his own pain");
        listValues.add("BILK: cheat by taking their money");
        listValues.add("SOLICIT: request  earnestly");

        listValues.add("SCUTTLE: sink");
        listValues.add("PRECEDENT: an earlier occurrrance");
        listValues.add("SENTINEL: lookout");
        listValues.add("MAELSTROM: whirlpool");

        listValues.add("PLIABLE: flexible, adaptable");
        listValues.add("HYPOCHONDRIAC: person unduly worried about his health");
        listValues.add("DRIVEL: nonsense");
        listValues.add("DILEMMA: choice of true unsatisfactory alternatives");

        listValues.add("ENFRANCHISE: admit to the right of citizenship");
        listValues.add("JAUNDICED: hostile");
        listValues.add("GALL: annoy");
        listValues.add("DISCORD: lack of harmony");

        listValues.add("PROLIXITY: verbosity");
        listValues.add("LANGUID: weary, sluggish");
        listValues.add("ENSCONCE: settle comfortable");
        listValues.add("BOYCOTT: refrain or avoid or ignore");

        listValues.add("VEHEMENT: intensely emotional");
        listValues.add("PRIMORDIAL: existing for the beginning");
        listValues.add("KNOTTY: tangled");
        listValues.add("VAGRANT: stray, random");

        listValues.add("PENSIVE: thoughtful with a hint of sadness");
        listValues.add("JOLLITY: cheerfulness, very happy");
        listValues.add("ROBUST: strong, vigorous");
        listValues.add("OBJECTIVE: not influenced by emotions");

        listValues.add("STIFLE: suppress");
        listValues.add("INVIDIOUS: designed to create ill will or envy");
        listValues.add("MODICUM: limited quantity");
        listValues.add("GRATIS: free");

        listValues.add("CLAIRVOYANT: having foresight");
        listValues.add("CANDOR: frankness");
        listValues.add("COERCION: use of froce to get someone to obey");
        listValues.add("INTANGIBLE: which cannot be touched");

        listValues.add("EFFACE: rub out");
        listValues.add("CHARLATAN: pretender to knowledge");
        listValues.add("SANCTIMONIOUS: displaying ostentatious devoutness");
        listValues.add("INSURGENT: rebellious");

        listValues.add("CONSCRIPT: person forced into military service");
        listValues.add("ARBITRARY: decided or taken without any plan");
        listValues.add("VERBIAGE: pompous array of words");
        listValues.add("REDUNDANT: repetitious");

        listValues.add("FORENSIC: scientific methods for finding about crime");
        listValues.add("VAGRANT: homeless wanderer");
        listValues.add("PODIUM: raised platform");
        listValues.add("FLAIL: strike or slap");

        listValues.add("ALLURE: entice");
        listValues.add("UNDERSCORE: emphasize");
        listValues.add("SIDEREAL: relating to the stars");
        listValues.add("PARSIMONY: frugality");

        listValues.add("TEETOTALISM: avoiding alcoholic drinks");
        listValues.add("FANATICISM: excessive zeal or enthusiasm");
        listValues.add("PARITY: equality");
        listValues.add("CALLOW: youthful");

        listValues.add("BLASPHEMY; cursing");
        listValues.add("COALESCE: combine");
        listValues.add("EMACIATED: wasted");
        listValues.add("COLLAGE: work of art put together from fragments");

        listValues.add("CALDRON: large kettle");
        listValues.add("DROSS; waste matter");
        listValues.add("");
        listValues.add("");

        listValues.add("");
        listValues.add("");
        listValues.add("");
        listValues.add("");

        listValues.add("");
        listValues.add("");
        listValues.add("");
        listValues.add("");




        // initiate the listadapter

        ArrayAdapter<String> myAdapter = new ArrayAdapter <String>(this,

                R.layout.row_layoutlist, R.id.listText, listValues);



        // assign the list adapter

        setListAdapter(myAdapter);



    }



    // when an item of the list is clicked

    @Override

    protected void onListItemClick(ListView list, View view, int position, long id) {

        super.onListItemClick(list, view, position, id);



        String selectedItem = (String) getListView().getItemAtPosition(position);

        //String selectedItem = (String) getListAdapter().getItem(position);
        int pos=position;

        if(pos==0) {

            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");

        }
        else if(pos==1){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");


        }
        else if(pos==2){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");


        }
        else if(pos==3){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");


        }
        else if(pos==4){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");


        }
        else if(pos==5){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");


        }
        else if(pos==6){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==7){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==8){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==9){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==10){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==11){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==12){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==13){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==14){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==15){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==16){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");

        }
        else if(pos==17){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==18){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==19){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");

        }
        else if(pos==20){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");

        }
        else if(pos==21){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==22){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==23){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==24){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==25){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==26){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");

        }
        else if(pos==27){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==28){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==29){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==30){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==31){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==32){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==33){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==34){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");

        }
        else if(pos==35){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");

        }
        else if(pos==36){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==37){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==38){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==39){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==40){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==41){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==42){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==43){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==44){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==45){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==46){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==47){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==48){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==49){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==50){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==51){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==52){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==53){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==54){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==55){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==56){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==57){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==58){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==59){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==60){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==61){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==62){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==63){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==64){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==65){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==66){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==67){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==68){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==69){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==70){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==71){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==72){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==73){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==74){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==75){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==76){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==77){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==78){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==79){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==80){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==81){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==82){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==83){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==84){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==85){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==86){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==87){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==88){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==89){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==90){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==91){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==92){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==93){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==94){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==95){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==96){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==97){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==98){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==99){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==100){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==101){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==102){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==103){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==104){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==105){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==106){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==107){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==108){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==109){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==110){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==111){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==112){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==112){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==113){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==114){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==115){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==116){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==117){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==118){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==119){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==120){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==121){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==122){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==123){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==124){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==125){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==126){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==127){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==128){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==129){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==130){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==131){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==132){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==133){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==134){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==135){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==136){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==137){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==138){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==139){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==140){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==141){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==142){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==143){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==144){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==145){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==146){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==147){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==148){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==149){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==150){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==151){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==152){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==153){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==154){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==155){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==156){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==157){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==158){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==159){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==160){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==161){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==162){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==163){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==164){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==165){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==166){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==167){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==168){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==169){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==170){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==171){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==172){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==173){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==174){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==175){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==176){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==177){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==178){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==179){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==180){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==181){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==182){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==183){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==184){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==185){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==186){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==187){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==188){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==189){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==190){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==191){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==192){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==193){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==194){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==195){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==196){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==197){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==198){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==199){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==200){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==201){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==202){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==203){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==204){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==205){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==206){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==207){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==208){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==209){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==210){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==211){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==212){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==213){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==214){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==215){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==216){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==217){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==218){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==219){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==220){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==221){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==222){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==223){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==224){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==225){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==226){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==227){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==228){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==229){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==230){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==231){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==232){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==233){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==234){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==235){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==236){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==237){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==238){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==239){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==240){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==241){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==242){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==243){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==244){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==245){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==246){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==247){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==248){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==249){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==250){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==251){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==252){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==253){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==254){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==255){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==256){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==257){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==258){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==259){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==260){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==261){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==262){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==263){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==264){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==265){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==266){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==267){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==268){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==269){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==270){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==271){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==272){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==273){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==274){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==275){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==276){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==277){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==278){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==279){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==280){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==281){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==282){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==283){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==284){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==285){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==286){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==287){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==288){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==289){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==290){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==291){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==292){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==293){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==294){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==295){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==296){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==297){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==298){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==299){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==300){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==301){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==302){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==303){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==304){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==305){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==306){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==307){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==308){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==309){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==310){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==311){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==312){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==313){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==314){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==315){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==316){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==317){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==318){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==319){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==320){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==321){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==322){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==323){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==324){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==325){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==326){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==327){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==328){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==329){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==330){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==331){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==332){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==333){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==334){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==335){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==336){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==337){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==338){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==339){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==340){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==341){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==342){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==343){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==344){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==345){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==346){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==347){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==348){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==349){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==350){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==351){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==352){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==353){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==354){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==355){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==356){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==357){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==358){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==359){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==360){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==361){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==362){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==363){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==364){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==365){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==366){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==367){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==368){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==369){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==370){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==371){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==372){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==373){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==374){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==375){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==376){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==377){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==378){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==379){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==380){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==381){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==382){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==383){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==384){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==385){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==386){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==387){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==388){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==389){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==390){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==391){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==392){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==393){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==394){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==395){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==396){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==397){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==398){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==399){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==400){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==401){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==402){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==403){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==404){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==405){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==406){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==407){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==408){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==409){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==410){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==411){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==412){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==413){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==414){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==415){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==416){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==417){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==418){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }

        else if(pos==419){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==420){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==421){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==422){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==423){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==424){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==425){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==426){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==427){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==428){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }

        else if(pos==429){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==430){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==431){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==432){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==433){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==434){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==435){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==436){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==438){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==439){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==440){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==441){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==442){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==443){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==444){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==445){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==446){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==447){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==448){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==449){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==450){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==451){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==452){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==453){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==454){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==455){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==456){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==457){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==458){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==459){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }

        else if(pos==460){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==461){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==462){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==463){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==464){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==465){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==466){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==467){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==468){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==469) {
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==470){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==471){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==472){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==473){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==474){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==475){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==476){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==477){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==478){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==479){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }

        else if(pos==480){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==481){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==482){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==483){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==484){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==485){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==486){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==487){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==488){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==489){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==490){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==491){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==492){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==493){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==494){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==495){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==496){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==497){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==498){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==499){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }

        else if(pos==500){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }




        text.setText("You clicked " + selectedItem + " at position " + position);

    }



}


