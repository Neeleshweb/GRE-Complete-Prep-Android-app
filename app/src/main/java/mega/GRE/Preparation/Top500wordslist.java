package mega.GRE.Preparation;

import android.app.ListActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import static android.app.PendingIntent.getActivity;

public class Top500wordslist extends ListActivity {
    private TextView text;

    private List<String> listValues;



    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_top500wordslist);



        text = (TextView) findViewById(R.id.first);



        listValues = new ArrayList<String>();

        listValues.add("SOPORIFIC: Sleep Causing,lazy");
        listValues.add("PLUMMET: Fallen Sharply");

        listValues.add("INSULARITY: Isolation");

        listValues.add("AUSTERE: Severely Simple");

        listValues.add("WELTER: Jumbled,Shattered");

        listValues.add("SHARD: Smell of pottery");
        listValues.add("PLASTICITY: Ability to be molded");
        listValues.add("WARY: Very Cautious");
        listValues.add("SAVOR: Having a distinctive flavour");
        listValues.add("OSCILLATE: To and fro motion");
        listValues.add("APPRISE: Inform");
        listValues.add("SUPPOSITION: Assumption");
        listValues.add("STINT: Limited work");
        listValues.add("RESCIND: Cancel");
        listValues.add("SUBPOENA: A writ summoning a witness to appear in court");
        listValues.add("OCCLUDE: Shut down,Close");
        listValues.add("RECONDITE: Secret");
        listValues.add("LAUD: Praise");
        listValues.add("DISSONANCE: Opposite of Harmony");
        listValues.add("CONTRITE: Penitent,Remorse");
        listValues.add("DOCUMENT: A written form");
        listValues.add("OBSEQUIOUS: Slavishly Attentive");
        listValues.add("ENGENDER: Produce");
        listValues.add("DISSEMBLE: Disguise,Pretend");
        listValues.add("RECALCITRANT: Stubborn,Intractable");
        listValues.add("IMPERVIOUS: Impenetrable");
        listValues.add("DISCREDIT: Defame");
        listValues.add("ASSIDUOUS: Very proper schedule");
        listValues.add("STRUT: Pompous walk,Supporting bar");
        listValues.add("PHLEGMATIC: Calm,Placid");
        listValues.add("IMPASSIVE: Dull,Without feeling");
        listValues.add("STOLID: Impassive,Cannot be disturbed");
        listValues.add("PERVASIVE: Spread Throughout");
        listValues.add("GOAD: Tear Out");
        listValues.add("ARTLESS: Honest,Straightforward");
        listValues.add("SPECTRUM: A band showing 7 colours");
        listValues.add("SALUBRIOUS: Healthful");
        listValues.add("OSTENTATIOUS: Trying to gain attention");
        listValues.add("SPECIOUS: Misleading");
        listValues.add("EMPIRICAL: Based on experience");
        listValues.add("LOQUACIOUS: Talkative");
        listValues.add("DISPARATE: Separate");
        listValues.add("CATALYST: Increase or decrease rate");
        listValues.add("ATTENUATE: Weaken");
        listValues.add("DELINEATE: Depict,portray,sketch");
        listValues.add("DOGMATIC: Opinionated");
        listValues.add("DIRGE: Lament,Sorrow");
        listValues.add("AUDACIOUS: Bold,daring");
        listValues.add("STIGMA: Disgraceful");
        listValues.add("MOLLIFY: Soothing");
        listValues.add("DISMISS: Deny,reject");
        listValues.add("APPROBATION: Approval");
        listValues.add("RESOLUTION: Determination");
        listValues.add("IRRESOLUTE: Uncertain how to act");
        listValues.add("CONCILIATORY: Reconcile,soothing");
        listValues.add("DISJOINTED: Disconnected,Separate,Discrete");
        listValues.add("GULLIBLE: Deceived easily");
        listValues.add("DISCREPANCY: Lack of consistency,difference");
        listValues.add("BUTTRESS: Support");
        listValues.add("CONTENSION: Thesis,Claim");
        listValues.add("EFFRONTERY: Boldness,Shameless");
        listValues.add("NEGATE: Deny");
        listValues.add("INDIGENCE: Poverty");
        listValues.add("TRACTABLE: Easily manageable");
        listValues.add("NEOPHYTE: Beginner,Novice");
        listValues.add("SUBSTANTIATE: Verify");
        listValues.add("VERBOSE: Wordy");
        listValues.add("ABEYANCE: Suspended action");
        listValues.add("INSINUATE: Hint,imply");
        listValues.add("PENURY: Very poor,Poverty");
        listValues.add("VITUPERATIVE: Scolding");
        listValues.add("PIETY: Respect for god");
        listValues.add("INCHOATE: Elementary,beginning stage");
        listValues.add("DISINGENUOUS: Slightly dishonest,Sophisticated");
        listValues.add("ADMONISH: Warning");
        listValues.add("WARRANTED: Authorised");
        listValues.add("MUNDANE: Everyday,Hackneyed");
        listValues.add("APATHY: Understand one's feelings");
        listValues.add("DIFFIDENCE: Shyness");
        listValues.add("EULOGY: Praise");
        listValues.add("DERIVATIVE: Which is not real but derived");
        listValues.add("AGGREGATE: Accumulate");
        listValues.add("COMPLAISANT: Trying to please");
        listValues.add("EQUIVOCATE: Misleading");
        listValues.add("INERT: Inactive,Lazy");
        listValues.add("FOMENT: Stir up,commotion");
        listValues.add("QUIBBLE: Complaint");
        listValues.add("INSIPID: Dull,lack in flavour");
        listValues.add("PRAGMATIC: Practical");
        listValues.add("SOLICITOUS: Concerned");
        listValues.add("ABSCOND: Hide and walk away secretly");
        listValues.add("IMPERMEABLE: Unpenetrable,Not allow to pass");
        listValues.add("LEVEE: Embankment to prevent flooding");
        listValues.add("TIRADE: Extended Scolding");
        listValues.add("IMPLODE: Burst inward");
        listValues.add("PLETHORA: Excess,Abundance");
        listValues.add("MALLEABLE: Which can be moulded");
        listValues.add("FLEDGLING: Beginner,un-experienced");
        listValues.add("TORPOR: Lethargy,Sluggishness,Drowsy");
        listValues.add("PERMEABLE: Introductory Statement");
        listValues.add("LUMINOUS: Producing light");
        listValues.add("BURGEON: Grow forth");
        listValues.add("EMULATE: Imitate");
        listValues.add("IMPLICIT: Already understood,Unspoken");
        listValues.add("DIVEST: Deprive of");
        listValues.add("AUTONOMOUS: Self governing");
        listValues.add("CONFOUND: Confused");
        listValues.add("GOUGE: Urge on");
        listValues.add("MOROSE: Ill-humoured");
        listValues.add("INTRANSIGENCE: Stubborn");
        listValues.add("PROPRIETY: Good conduct,proper manner");
        listValues.add("PARTISAN: Committed to a party");
        listValues.add("PRECURSOR: Forerunner");
        listValues.add("REFRACTORY: Stubborn");
        listValues.add("ABERRANT: Abnormal,Exception,Irregular");
        listValues.add("LETHARGIC: Drowsy,Dull");
        listValues.add("PERENNIAL: Long lasting");
        listValues.add("REPROACH: Express disapproval or disappointment");
        listValues.add("PROBLEMATIC: Causing problem");
        listValues.add("INCONGRUITY: Absurdity");
        listValues.add("DEFERENCE: Respectful");
        listValues.add("ADULTERATE: Mixing impurities");
        listValues.add("BOMBASTIC: Using highly inflated language");
        listValues.add("CONUNDRUM: Complex problem or situation");
        listValues.add("DISSOLUTION: Resolving an issue");
        listValues.add("CASTIGATION: Punishment,Severe criticism");
        listValues.add("APPEASE: Relief");
        listValues.add("CAPRICIOUS: Unpredictable");
        listValues.add("DERIDE: Make fun of");
        listValues.add("INUNDATE: Flood");
        listValues.add("FLAG: Weaken,Feeble");
        listValues.add("RECANT: Openly Confess Error");
        listValues.add("LACONIC: Brief and to the point ");
        listValues.add("QUIESCENT: At rest,dormant");
        listValues.add("REPUDIATE: Disown,Disavow");
        listValues.add("ABATE: Settle down,Subside");
        listValues.add("GAINSAY: Deny");
        listValues.add("POROUS: Consisting of pores for passing");
        listValues.add("SAGE: A person worshipped for wisdom");
        listValues.add("IMPERTURBABLE: Which cannot be disturbed");
        listValues.add("PREVARICATE: Lie");
        listValues.add("SUBSIDE: Settle down");
        listValues.add("DETERRENT: Hindrance");
        listValues.add("DIVERGE: To move away from point");
        listValues.add("HARANGUE: Vehement Speech");
        listValues.add("DISTEND: Expand");
        listValues.add("CONDONE: Overlook,Excuse");
        listValues.add("DISPARAGE: Separate");
        listValues.add("FACILITATE: Make easy");
        listValues.add("METICULOUS: Excessively careful");
        listValues.add("ICONOCLASTIC: Attacking cherished traditions");
        listValues.add("PAUCITY: Scarcity");
        listValues.add("REPROBATE: Person hardened in sin");
        listValues.add("TACIT: Implicit");
        listValues.add("AMBIGUOUS: Doubtful in meaning");
        listValues.add("IDOLATRY: Worshipping of idols");
        listValues.add("PRECIPITATE: Rash,immature,hasty");
        listValues.add("TENUOUS: Thin,rare,slim");
        listValues.add("LOG: Collection of records");
        listValues.add("PROBITY: Uprightness,In-corruptibility");
        listValues.add("VERACIOUS: Truthful");
        listValues.add("BOLSTER: Support");
        listValues.add("EXACERBATE: Worsen,embitter");
        listValues.add("MAGNANIMITY: Generosity");
        listValues.add("PROFOUND: Deep,secret");
        listValues.add("RAREFIED: Made less dense");
        listValues.add("IMMUTABLE: Unchangeable");
        listValues.add("ECLECTIC: Selective");
        listValues.add("ALACRITY: Cheerful promptness");
        listValues.add("VENERATE: Respect for something holy or old");
        listValues.add("PRISTINE: Unspoiled");
        listValues.add("HYPERBOLE: Exaggeration");
        listValues.add("VACILLATE: oscillate");
        listValues.add("PRECARIOUS: Risky,Uncertain");
        listValues.add("FELICITOUS: Apt,Suitably chosen");
        listValues.add("ABSTEMIOUS: Sparing in eating and drinking");
        listValues.add("SUPERSEDE: To make Obsolete");
        listValues.add("RECLUSE: Hermit,Loner");
        listValues.add("PLACATE: Pacify");
        listValues.add("SANCTION: Approval");
        listValues.add("FAWNING: PLeading favour with flattery");
        listValues.add("INURED: Hardened");
        listValues.add("ENDEMIC: Spread in large area");
        listValues.add("DIATRIBE: Severe Punishment,Criticism");
        listValues.add("ALLEVIATE: Relief");
        listValues.add("DIFFUSE: Spread out");
        listValues.add("EXTRAPOLATION: Projection");
        listValues.add("DISINTEGRATION: Breaking down,separating");
        listValues.add("DESULTORY: Aimless");
        listValues.add("COMPLIANT: Conformance to requirements");
        listValues.add("DISABUSE: Free from blame");
        listValues.add("ENHANCE: Improve,make better");
        listValues.add("CRAVEN: Cowardly");
        listValues.add("BANAL: Lacking originality");
        listValues.add("CONVOLUTED: Involved");
        listValues.add("ELICIT: Draw out by discussion");
        listValues.add("GREGARIOUS: Sociable");
        listValues.add("FALLACIOUS: False,misleading");
        listValues.add("PROPITIATE: Appease");
        listValues.add("INADVERTENTLY: Carelessly");
        listValues.add("PROPENSITY: Natural Inclination");
        listValues.add("RELEGATE: Go down to lower position");
        listValues.add("AMELIORATE: Improve");
        listValues.add("FATUOUS: Foolish");
        listValues.add("MALINGERER: Giving excuses for not working");
        listValues.add("REVERENT: Respectful");
        listValues.add("FLOUT: Reject,mock");
        listValues.add("MENDACIOUS: Lying");
        listValues.add("TANGENTIAL: Peripheral");
        listValues.add("ANALOGOUS: Comparable");
        listValues.add("ELEGY: Poem expressing lamentation");
        listValues.add("FRUGALITY: Economy,not wasting");
        listValues.add("PRESUMPTUOUS: Arrogant");
        listValues.add("SKEPTIC: Doubtful");
        listValues.add("LEVITY: Lack of seriousness");
        listValues.add("ERUDITE: Scholarly,Learned");
        listValues.add("ASSUAGE: Satisfied");
        listValues.add("VISCOUS: Sticky,Gluey");
        listValues.add("PROHIBITIVE: To prevent or forbid");
        listValues.add("INTRACTABLE: Which cannot be managed");
        listValues.add("VIABLE: Practical");
        listValues.add("PERFIDIOUS: Disloyal");
        listValues.add("INHERENT: Habit");
        listValues.add("AMALGAMATE: Unite and produce");
        listValues.add("SPORADIC: Irregular");
        listValues.add("METAMORPHOSIS: Change of form");
        listValues.add("STRIATED: Consisting of bands");
        listValues.add("HOMOGENEOUS: Uniformly mixed");
        listValues.add("LUCID: Easily Understood");
        listValues.add("GRANDILOQUENT: Pompous,Bombastic");
        listValues.add("DORMANT: At rest,motionless");
        listValues.add("COMPENDIUM: Brief");
        listValues.add("ENERVATE: Weaken");
        listValues.add("GUILELESS: Innocent");
        listValues.add("EPHEMERAL: Short lived");
        listValues.add("CONVERGE: Meet at a point");
        listValues.add("CAUSTIC: Burning,Sarcastic");
        listValues.add("COGENT: Convincing");
        listValues.add("DICHOTOMY: Split");
        listValues.add("CODA: Concluding section of musical composition");
        listValues.add("ANTIPATHY: Aversion,dislike");
        listValues.add("CHICANERY: Servile Flattery");
        listValues.add("DECORUM: Proper conduct");
        listValues.add("EXCULPATE: Clear from blame");
        listValues.add("DISTILL: Purify,Refine");
        listValues.add("SATIATE: Satisfy to the full");
        listValues.add("FORESTALL: Prevent by taking action in advance");
        listValues.add("PRODIGAL: Wasteful with money");
        listValues.add("TRANSGRESSION: Violation of law,sin");
        listValues.add("AESTHETIC: Artistic");
        listValues.add("EBULLIENT: Showing excitement,Enthusiasm");
        listValues.add("INDETERMINATE: Which cannot be determined");
        listValues.add("WHIMSICAL: Fanciful");
        listValues.add("EFFICACY: Power to produce desired effect");
        listValues.add("INSENSIBLE: Unresponsive,");
        listValues.add("ZEALOT: Excessive zeal,passion");
        listValues.add("AMBIVALENCE: Contradictory imotional attitude");
        listValues.add("CONNOISSEUR: Lover of an art");
        listValues.add("EMBELLISH: Decorate,Enhance");
        listValues.add("INVECTIVE: Abuse");
        listValues.add("PENCHANT: Strong liking");
        listValues.add("INCONSEQUENTIAL: Insignificant");
        listValues.add("DIGRESSION: Wandering away from subject");
        listValues.add("BENEFICENT: Kindly,doing good");
        listValues.add("TORTUOUS: Winding,full of curves");
        listValues.add("MITIGATE: Moderate,appease");
        listValues.add("FERVOR: Intensity of feeling");
        listValues.add("STIPULATE: Specify");
        listValues.add("MAVERICK: Rebel,Non-conformist");
        listValues.add("FACETIOUS: Joking,humorous");
        listValues.add("ARDUOUS: Hard,strenuous");
        listValues.add("RETICENT: Uncommunicative,Usually silent");
        listValues.add("PROSCRIBE: Banish,outlaw");
        listValues.add("INNOCUOUS: Harmless");
        listValues.add("QUALIFIED: Limited,Restricted");
        listValues.add("EXIGENCY: Urgent situation");
        listValues.add("INCORPORATE: Combine,unite");
        listValues.add("DISCORDANT: Conflicting");
        listValues.add("DAUNT: Frighten,intimidate");
        listValues.add("COMMENSURATE: To equal extent");
        listValues.add("DEFAULT: Failure to oblige");
        listValues.add("DISSEMINATE: Scatter,distribute");
        listValues.add("DESICCATE: Dry up");
        listValues.add("CONTENTIOUS: Quarrelsome");
        listValues.add("AVER: State confidently");
        listValues.add("BURNISH: Polish");
        listValues.add("DISCRETE: Separated,Unconnected");
        listValues.add("BOORISH: Rude,insensitive");
        listValues.add("ASCETIC: Austere");
        listValues.add("BELIE: Contradict,give a false expression");
        listValues.add("DENIGRATE: Blacken");
        listValues.add("IMPAIR: Injured");
        listValues.add("DUPE: Someone easily fooled");
        listValues.add("PUNGENT: Bitter,Stinging");
        listValues.add("ITINERARY: Plan of a trip");
        listValues.add("PROLIFERATE: Increase,Multiply");
        listValues.add("REFUTE: Disprove");
        listValues.add("ANACHRONISM: Someone or something misplaced in time");
        listValues.add("EQUANIMITY: Calmness of temperament");
        listValues.add("OFFICIOUS: Too pushy in offering one's services");
        listValues.add("RESOLVE: Determination");
        listValues.add("FUTILE: Useless");
        listValues.add("OPPROBRIUM: Severe criticism,blame");
        listValues.add("SECRETE: Produce and insert");
        listValues.add("ANOMALOUS: Irregular");
        listValues.add("COAGULATE: Thicken,clot");
        listValues.add("GARRULOUS: Loquacious,Talkative");
        listValues.add("PREAMBLE: Introductory statement");
        listValues.add("OBTUSE: Blunt,stupid");
        listValues.add("IMPORTUNE: Beg persistently");
        listValues.add("DEIGN: Condescend,Stoop");
        listValues.add("BELLIGERENT: Quarrelsome");
        listValues.add("VOLITION: Act of making conscious choice");
        listValues.add("OBLIQUE: Indirect,Slanting");
        listValues.add("IMPETUOUS: Violent,Hasty");
        listValues.add("VERISIMILITUDE: Likelihood");
        listValues.add("MAXIM: Proverb");
        listValues.add("EXECRABLE: Very bad");
        listValues.add("ACCRETION: Growth,increase");
        listValues.add("PREDILECTION: Partiality,preference");
        listValues.add("PERIPATETIC: Walk");
        listValues.add("INEFFABLE: Un-utterable");
        listValues.add("PRECLUDE: Eliminate,Make impossible");
        listValues.add("DUPLICITY: Hypocrisy");
        listValues.add("IMPUGN: Dispute or contradict");
        listValues.add("DISPORT: Amuse");
        listValues.add("COMPUNCTION: Remorse,Guilt");
        listValues.add("BENIGN: Kindly,Favourable");
        listValues.add("CONCENTRIC: Having a common center");
        listValues.add("DOUR: Stubborn");
        listValues.add("CORROBORATE: Confirm,support");
        listValues.add("CAPITULATE: Surrender");
        listValues.add("PROMULGATE: Proclaim a doctrine or law");
        listValues.add("INIMICAL: Hostile intent");
        listValues.add("DILETTANTE: Aimless follower of art");
        listValues.add("AGGRANDIZE: Increase in power");
        listValues.add("VICARIOUS: Done by deputy");
        listValues.add("PERSPICACIOUS: Having insight");
        listValues.add("INDIGENT: Poor,Poverty");
        listValues.add("SALIENT: Prominent");
        listValues.add("OBSTREPEROUS: Noisy");
        listValues.add("HETERODOX: Unorthodox");
        listValues.add("ABROGATE: Abolish");
        listValues.add("RECUMBENT: Reclining,Lying down");
        listValues.add("PUERILE: Childish");
        listValues.add("MALFEASANCE: Wrong doings");
        listValues.add("PUSILLANIMOUS: Cowardly,fainthearted");
        listValues.add("GUILE: Duplicity,cunning");
        listValues.add("INSIDIOUS: Treachery,Stealthy");
        listValues.add("EXULT: Rejoice");
        listValues.add("CIRCUMSCRIBE: Limit,confine");
        listValues.add("ANIMUS: Hostile");
        listValues.add("CREDULITY: Believe on slight evidence");
        listValues.add("FUSILLADE: Continuous or simultaneous outburst");
        listValues.add("DERISION: Ridicule");
        listValues.add("ATROPHY: Wasting away");
        listValues.add("REVILE: Attack with abusive language");
        listValues.add("PERQUISITE: Getting more than stipulated salary");
        listValues.add("EMPATHY: Understanding one's feeling");
        listValues.add("ACRID: Sharp,bitterly pungent");
        listValues.add("VORACIOUS: Ravenous");
        listValues.add("REJOINDER: Comeback,reply");
        listValues.add("OBFUSCATE: Confuse");
        listValues.add("TRANSCENDENT: Superior");
        listValues.add("PROSELYTIZE: Induce someone to convert religion");
        listValues.add("MALEVOLENT: Wishing evil");
        listValues.add("ABLUTION: Washing");
        listValues.add("TENDENTIOUS: Having an aim");
        listValues.add("SUBTERFUGE: Evasion,pretense");
        listValues.add("PHILOLOGY: Study of language");
        listValues.add("SUPPLICATE: petition humbly");
        listValues.add("HETEROGENEOUS: Dissimilar,mixed");
        listValues.add("PERTINACIOUS: Stubborn");
        listValues.add("ENIGMA: Puzzle");
        listValues.add("AFFABLE: Friendly");
        listValues.add("ACRIMONIOUS: Bitter in words or manners");
        listValues.add("AMITY: Friendly");
        listValues.add("EPITHET: Word used to describe a person");
        listValues.add("CONFLAGRATION: Great fire");
        listValues.add("ADVENTITIOUS: Casual,accidental");
        listValues.add("PROVIDENT: Preparing for emergencies");
        listValues.add("INTERLOPER: Intruder");
        listValues.add("DILATORY: Delaying");
        listValues.add("ABSTRUSE: Obscure,profound");
        listValues.add("VERACITY: Truthfulness");
        listValues.add("PROTRACT: Prolong");
        listValues.add("INSENSATE: Without feeling");
        listValues.add("UNCONSCIONABLE: Excessive");
        listValues.add("PRECOCIOUS: Advanced in development");
        listValues.add("FRACTIOUS: Unruly");
        listValues.add("ABJECT: Wretched,Lacking pride");
        listValues.add("TENACIOUS: Holding fast");
        listValues.add("REPREHENSIBLE: Deserving blame");
        listValues.add("PHILANDERER: Faithless lover,Flirt");
        listValues.add("SEDITION: Resistance to authority");
        listValues.add("EUPHONY: Sweet sound");
        listValues.add("PETULANT: Touchy,peevish");
        listValues.add("EFFIGY: Dummy");
        listValues.add("CONFLUENCE: Flowing together");
        listValues.add("ACQUIESCE: Agree passively");
        listValues.add("CONVOKE: Call together");
        listValues.add("EPIGRAM: Witty thought");
        listValues.add("CURSORY: Casual");
        listValues.add("CIRCUMSPECT: Prudent,cautious");
        listValues.add("QUERULOUS: Whining");
        listValues.add("MALADROIT: Clumsy,not clever");
        listValues.add("DELUDE: Deceive");
        listValues.add("ABJURE: Renounce upon oath");
        listValues.add("VOCIFEROUS: Noisy");
        listValues.add("PUNCTILIOUS: Minutely attentive to fine points");
        listValues.add("MAGNATE: person of prominence");
        listValues.add("VERITY: Act of being truthful");
        listValues.add("PRESENTIMENT: Premonition");
        listValues.add("INDUCE: Persuade,bring about");
        listValues.add("ABDICATE: Give up");
        listValues.add("TACITURN: Silent,Uncommunicative");
        listValues.add("SUBJUGATE: Bring under control");
        listValues.add("INCURSION: Temporary invasion");
        listValues.add("NASCENT: Coming into being");
        listValues.add("DOCTRINE: Teachings in general");
        listValues.add("CIRCUITOUS: Winding,consisting of curves");
        listValues.add("APOTHEOSIS: A perfect example");
        listValues.add("CONGENITAL: Present since birth");
        listValues.add("HYPOCRITICAL: Deceiving");
        listValues.add("CONTRAVENE: Contradict");
        listValues.add("BEMOAN: Express lamentation");
        listValues.add("PRESAGE: Foretell");
        listValues.add("LAMENT: Express sorrow");
        listValues.add("ESCHEW: Avoid");
        listValues.add("BASK: Luxuriate in warmth");
        listValues.add("VITIATE: Un-operative");
        listValues.add("PIVOTAL: Critical,Central");
        listValues.add("INEPT: Lacking skill");
        listValues.add("TRANSITORY: Impermanent");
        listValues.add("OMINOUS Threatening");
        listValues.add("IMPUTE: Attribute,ascribe");
        listValues.add("ALLOY: A mixture of metals");
        listValues.add("SUBSUME: Include,encompass");
        listValues.add("SHUNT: Turn aside,divert");
        listValues.add("MELLIFLUOUS: Melodious");
        listValues.add("SORDID: Dishonourable actions");
        listValues.add("GORGE: Steep");
        listValues.add("LULL: Moment of calm");
        listValues.add("EVINCE: Show clearly");
        listValues.add("DEPLETE: To exhaust,Reduce");
        listValues.add("COWER: Shrink,Quiver");
        listValues.add("EQUABLE: Steady,Uniform,moderate");
        listValues.add("GLEAN: Gather leavings");
        listValues.add("EQUILIBRIUM: Balance");
        listValues.add("DEMAGOGUE: False leader");
        listValues.add("REITERATE: Repeat");
        listValues.add("HOLSTER: Support case for pistol");
        listValues.add("ENTICE: Lure,bait");
        listValues.add("BROACH: Open up,Introduce");
        listValues.add("VEX: Annoy, distress");
        listValues.add("QUAFF: Drink with relish");
        listValues.add("GIST: Essence");
        listValues.add("VENEER: Thin layer");
        listValues.add("PARLEY: Conference");
        listValues.add("GARNER: Gather");
        listValues.add("ASEPTIC: Preventing infection");
        listValues.add("UPBRAID: Severely scold");
        listValues.add("REPINE: Fret,complain");
        listValues.add("MENDICANT: Beggar");
        listValues.add("SCABBARD: Case for sword");
        listValues.add("FULSOME: Excessive");
        listValues.add("CONVENTION: A standard practice or rule");
        listValues.add("CHISEL: A tool for cutting/shaping");
        listValues.add("COY: Lure,Bait");
        listValues.add("FERMENT: Commotion");
        listValues.add("DEROGATORY: Expressing a low opinion");
        listValues.add("CLIENTELE: Body of customers");
        listValues.add("SUBORN: Decorate");
        listValues.add("PELLUCID: Easily understood");
        listValues.add("CONCUR: Agree");
        listValues.add("ANOMALY: Irregularity");
        listValues.add("WINCE: Shrink back");
        listValues.add("SLAKE: Quench");
        listValues.add("MITE: Very small creature");
        listValues.add("VERITABLE: Act of being truthful");
        listValues.add("SAGACIOUS: Person worshipped for wisdom");
        listValues.add("IRKSOME: Annoy,vex");
        listValues.add("ABHOR: Hate");
        listValues.add("TAWDRY: Cheap");
        listValues.add("SUPERIMPOSE: Place one over the other");
        listValues.add("REDOUBTABLE: Harmful");
        listValues.add("SUPPLIANT: Entreating");
        listValues.add("HARBINGER: Forerunner");
        listValues.add("PRY: Investigating in rude way");
        listValues.add("DISHEVELED: Untidy");
        listValues.add("BERATE: Respect");
        listValues.add("ANTIDOTE: For prevention from viruses");

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
            alert.showDialog(this, "EXAMPLE: The professor's lecture was so SOPORIFIC that all the students slept in the class.");

           }
        else if(pos==1){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: The stock market had PLUMMET since the last few days.");


        }
        else if(pos==2){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: Ram always lives in INSULARITY.He may be too shy to talk to others.");


        }
        else if(pos==3){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: The pandits are generally AUSTERE.They dont care what is happening, they are just focused on themselves");


        }
        else if(pos==4){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: John's room is weltered badly.He must arrange it properly before his mom comes.");



        }
        else if(pos==5){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: The pot fell down from the table and broke into SHARD.");



        }
        else if(pos==6){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: The PLASTICITY of hard metals like Diamond is neglegible");

        }
        else if(pos==7){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: John was WARY while climbing the slippery hill.");

        }
        else if(pos==8){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: The food served at hotel radison has entirely different SAVOR");

        }
        else if(pos==9){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: The pendulum OSCILLATES 24*7.");

        }
        else if(pos==10){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: All the students were APPRISED about tommorrow's holiday.");

        }
        else if(pos==11){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: Most of John's Theories are based on SUPPOSITIONS.");

        }
        else if(pos==12){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: John never works more than STINT.So he never gets over-paid.");

        }
        else if(pos==13){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: John immediately RESCINDED his reservation from today's flight.");

        }
        else if(pos==14){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: The judge gave SUBPOENA to the witness for appearing in the court.");

        }
        else if(pos==15){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: John's system was so heated that it automatically OCCLUDED after sometime.");

        }
        else if(pos==16){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: There is always a RECONDITE behind every successful person which is never reflected in public.");


        }
        else if(pos==17){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: After his eloquent speech, the audience LAUDED him with claps.");

        }
        else if(pos==18){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: There is great DISSONANCE in between wars.");

        }
        else if(pos==19){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: If someone's wastes his time in earlier stage of life, he will CONTRITE in future.");


        }
        else if(pos==20){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: DOCUMENTATION must be properly managed when someone is about to start his startup.");


        }
        else if(pos==21){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: John was so OBSEQUIOUS that the boss liked him very much,but his companions hated him for his attitude.");


        }
        else if(pos==22){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: Hard work in any field ENGENDERS perfect and long awaited success in dramatically unpredictive manner.");


        }
        else if(pos==23){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: Hitman game is all about stealth and DISSEMBLE.");
        }
        else if(pos==24){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: John is too RECALCITRANT to be managed and talk.He never adjusts in any situation.");

        }
        else if(pos==25){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: The more harder the metal is, the more IMPERVIOUS it will be.");

        }
        else if(pos==26){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: John was DEFAMED after losing the race after a long time.");


        }
        else if(pos==27){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: If one works ASSIDUOUSLY for a long time, success is guaranteed for him.");

        }
        else if(pos==28){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: The bridge had weak STRUT due to which it's life was so less.");
        }
        else if(pos==29){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: The lion was PHLEGMATIC before attacking his prey.");
        }
        else if(pos==30){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: He was so shocked with the news of his mother's death,that he became IMPASSIVE.");
        }
        else if(pos==31){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: He was so shocked with the news of his mother's death,that he became STOLID.");
        }
        else if(pos==32){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: The disease was highly communicable, so it spread PERVASIVELY like fire.");
        }
        else if(pos==33){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: John's body was GOAD badly.");


        }
        else if(pos==34){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: Being ARTLESS is sometimes not so good,as one may be misleaded if not clever.");


        }
        else if(pos==35){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: The visible light shows the SPECTRUM of seven colours.");
        }
        else if(pos==36){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: A balanced diet and regular routine will make us SALUBRIOUS.");
        }
        else if(pos==37){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: Beautiful girls are generally too much OSTENTATIOUS");
        }
        else if(pos==38){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: The solutions given in local books are generally SPECIOUS and hence should not be followed easily.");
        }
        else if(pos==39){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: The advice given to John by his grandfather was EMPIRICAL.");
        }
        else if(pos==40){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: LOQUACIOUS people are generally clear hearted but sometimes vex us also.");
        }
        else if(pos==41){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: There were DISPARATE rooms in the hotel, which were best for privacy and security point of view.");
        }
        else if(pos==42){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: The CATALYST suddenly increased the rate of reaction so much that the test tube became very hot. ");
        }
        else if(pos==43){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: Due to the persistant fever since the last few weeks John is ATTENUATED. ");
        }
        else if(pos==44){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: The best way to understand a topic in geometry is to DELINEATE the problem figure. ");
        }
        else if(pos==45){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: John was too DOGMATIC for the wedding.");
        }
        else if(pos==46){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: The death of the Prime Minister caused DIRGE in the entire nation. ");
        }
        else if(pos==47){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: The soldiers were quite AUDACIOUS, which led them to the great victory against their enemies. ");
        }
        else if(pos==48){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: If a child shows STIGMA towards his parents, it is very bad.");
        }
        else if(pos==49){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: Air Conditioner in summers produces a SOOTHING effect in the room.");
        }
        else if(pos==50){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: John was DISMISSED from his job, due to his dis-graceful behaviour with his boss.");
        }
        else if(pos==51){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: The Delhi metro project got it's APPROBATION due to its promising deadline.");
        }
        else if(pos==52){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: John is successful in his career due to his RESOLUTION towards his goal.");
        }
        else if(pos==53){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: When john got acute heart failure, everyone was just IRRESOLUTE for a moment.");
        }
        else if(pos==54){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: The medicine applied by doctor on john's wound produced a CONCILIATORY effect.");
        }
        else if(pos==55){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: Mathematics and Biology are entirely DISJOINTED branches.");
        }
        else if(pos==56){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: An experienced thief cannot be easily GULLIBLE.");
        }
        else if(pos==57){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: For the last few matches, there is lot of DISCREPANCY in Virat's performance.");
        }
        else if(pos==58){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: The BUTTRESS for the bridge was too weak for sustaining heavy load of traffic.");
        }
        else if(pos==59){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: For getting Phd from a good university, one must have proper CONTENTION prepared and published.");
        }
        else if(pos==60){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: The EFFRONTERY shown in today's movies are having a bad impact on children.");
        }
        else if(pos==61){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: Jenny NEGATED to John's proposal, since he was too Salacious.");
        }
        else if(pos==62){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: The small villages in the outskirts of the city live in extreme INDIGENCE.");
        }
        else if(pos==63){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: Proper indentation in coding provides TRACTABILITY to the project management.");
        }
        else if(pos==64){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: John knew he was a NEOPHYTE in FIFA, so he did not accepted the challenge. ");
        }
        else if(pos==65){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: The police SUBSTANTIATED the evidence, whether it was misleading or real. ");
        }
        else if(pos==66){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: According to john , if someone is WORDY, he has rich collection of vocab.");
        }
        else if(pos==67){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: The immediate response was needed at the accident site, but there was ABEYANCE which lead to the death of the victim.");
        }
        else if(pos==68){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: John was not able to do the math problem even after watching the HINT.");
        }
        else if(pos==69){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: The small villages in the outskirts of the city lived in extreme PENURY");
        }
        else if(pos==70){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: John received VITUPERATIVE after he failed in mathematics exam.");
        }
        else if(pos==71){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: Everyone must have PIETY for god, since he is the supreme power of all.");
        }
        else if(pos==72){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: Cancer must be treated when it is INCHOATE , otherwise in later stages it may result to death.");
        }
        else if(pos==73){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: John was DISINGENUOUS in the court, due to which he was suspected more.");
        }
        else if(pos==74){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: The weather report ADMONISHED the city of the upcoming storm.");
        }
        else if(pos==75){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: John always bought only those products which were WARRANTED.");
        }
        else if(pos==76){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: The MUNDANE routine of John was too boring, so he wanted to do something else to change it.");
        }
        else if(pos==77){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: We must have APATHY with others.");
        }
        else if(pos==78){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: The girl's cheek grew red, that showed she was DIFFIDENCE in nature.");
        }
        else if(pos==79){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: John thanked the crowd after receiving the EULOGY from them for his great performance.");
        }
        else if(pos==80){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: Apple juice is DERIVATIVE of fresh apples.");
        }
        else if(pos==81){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: John's AGGREGATE was low, since his performance graph was not consistent.");
        }
        else if(pos==82){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: Jenny was COMPLAISANT in her approach to convince her parents for the marriage, but they negated it.");
        }
        else if(pos==83){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: Advertisements for products are generally EQUIVOCATE, so they should never be trusted");
        }
        else if(pos==84){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: Neon is an INERT gas.");
        }
        else if(pos==85){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: The death of the President caused a great FOMENT , which was not subsided by the police also. ");
        }
        else if(pos==86){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: Despite of so much QUIBBLE , there was no action taken by company to improve the service.");
        }
        else if(pos==87){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: The fruit juice was too INSIPID to drink, it was tasteless, so everyone avoided it further.");
        }
        else if(pos==88){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: PRAGMATIC knowledge about a subject is must after understanding the theory.");
        }
        else if(pos==89){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: John was too much addictive to drinking which was a SOLICITOUS issue for his health.");
        }
        else if(pos==90){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: During the war a soldier was too intimidated to fight more, so he tried to abscond but was killed.");
        }
        else if(pos==91){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: Human body is IMPERMEABLE, that is nothing could pass through it.");
        }
        else if(pos==92){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: The waves were so high that it crossed the LEVEE and entered the village.");
        }
        else if(pos==93){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: The criminal was treated with TIRADE, and finally he confessed his crime.");
        }
        else if(pos==94){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: Appendix in stomach if not operated at right time may IMPLODE and cause immediate death.");
        }
        else if(pos==95){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: There is PLETHORA of water on Earth's surface, but we should not waste it due its abundance.");
        }
        else if(pos==96){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: Most of metals are MALLEABLE and can be easily given different shapes and sizes.");
        }
        else if(pos==97){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: John was FLEDGLING IN FIFA, so he was not ready to accept the challenge.");
        }
        else if(pos==98){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: If a person becomes TORPOR in his working, then he can never succeed.");
        }
        else if(pos==99){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: Every effective speech should have proper PREAMBLE, for attracting the listeners.");
        }
        else if(pos==100){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: The LUMINOUS intensity of light is quite high.");
        }
        else if(pos==101){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: As car prices go down, car dealers are expecting sales to burgeon.");
        }
        else if(pos==102){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: A monkey always EMULATE human's activities.");
        }
        else if(pos==103){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: Some facts are just IMPLICIT, they are never conveyed, rather they are already understood.");
        }
        else if(pos==104){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: Malnutrition generally occurs in poor, since they are DIVEST of proper nutrients and minerals.");
        }
        else if(pos==105){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: Google has used large no of AUTONOMOUS Algorithms in its development.");
        }
        else if(pos==106){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: A person who understands concepts gets CONFOUND, but the one who does not is a fool.");
        }
        else if(pos==107){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: John GOUGE to install his application to everyone, but actually no one did.");
        }
        else if(pos==108){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: A person who is generally too much serious, is often MOROSE.");
        }
        else if(pos==109){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: John is too INTRANSIGENCE to understand and manage. He never listens to anyone ever.");
        }
        else if(pos==110){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: A person with PROPRIETY is always respected and honoured.");
        }
        else if(pos==111){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: Narendra Modi is PARTISAN to BJP.");
        }
        else if(pos==112){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: Due to john's PRECURSOR habit, sometimes he escapes the danger.");
        }
        else if(pos==112){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: John is too REFRACTORY to understand and manage. He never listens to anyone ever.");;
        }
        else if(pos==113){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: Today's weather is quite ABERRANT, since the sunlight and rain are occurring simultaneously.");
        }
        else if(pos==114){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: John after drinking alcohol was feeling extremely LETHARGIC after taking cough syrup at night. ");
        }
        else if(pos==115){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: Duracell batteries are quite PERENNIAL.");
        }
        else if(pos==116){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: After seeing the result of John's performance in the exam, his parents were quite REPROACHED.");
        }
        else if(pos==117){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: The students were quite PROBLEMATIC for the teachers to subside.");
        }
        else if(pos==118){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: John's logic was just too INCONGRUENT for others to understand.");
        }
        else if(pos==119){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: We should always show DEFERENCE towards our elder's.");
        }
        else if(pos==120){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: The milkman added ADULTERATE to the milk to gain profit by selling the milk.");
        }
        else if(pos==121){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: When angry people usually become impatience and their tone becomes BOMBASTIC.");
        }
        else if(pos==122){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: It proved to be CONUNDRUM for the students to reach the college in time due very hot weather conditions.");
        }
        else if(pos==123){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: The problem of generator was quite DISSOLVED to greater extent after the mechanic worked on it for about 2 hours.");
        }
        else if(pos==124){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: The sin committed by the criminal deserved CASTIGATION.");
        }
        else if(pos==125){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: Air Conditioners generally APPEASE the problem of summers rising temperature.");
        }
        else if(pos==126){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: John's remark about the situation is quite CAPRICIOUS, and it made the situation more worse.");
        }
        else if(pos==127){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: John did not knew riding bike in high school, so his friends DERIDED him a lot.");
        }
        else if(pos==128){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: The rising temperature of earth will soon INUNDATE the coastel areas.");
        }
        else if(pos==129){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: Due to lack of food in poverty, the people were just becoming FLAG.");
        }
        else if(pos==130){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: The criminal RECANT in front of the audience and thus was punished less.");
        }
        else if(pos==131){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: The speech of the politician was quite RECANT, which impressed the crowd listening to him.");
        }
        else if(pos==132){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: Mosquitoes generally are QUIESCENT at a place at the time of breeding. ");
        }
        else if(pos==133){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: The girl REPUDIATE the boy's proposal.");
        }
        else if(pos==134){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: The strike was ABATED by the police officials before emergency.");
        }
        else if(pos==135){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: The girl GAINSAY to john's proposal.");
        }
        else if(pos==136){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: The plastic was not POROUS at all, thus not allowing any water to pass through it.");
        }
        else if(pos==137){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: In today's world there are very less people who can be called as SAGE.   ");
        }
        else if(pos==138){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: A person who becomes IMPERTURBABLE in his work succeeds some day, and this has been proved true by life-history of many popular personalities.");
        }
        else if(pos==139){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: John had developed a habit of PREVARICATE all the time to his mother, so his mother lost trust in him slowly.");
        }
        else if(pos==140){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: The police tried to SUBSIDE the mob with their full power but the crowd was just too much out of control. ");
        }
        else if(pos==141){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: Being lazy is the biggest DETERRENT in the person's life if he want's to get his goal.");
        }
        else if(pos==142){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: Both the roads DIVERGE to different points and thus cause lots of confusion for the travellers.");
        }
        else if(pos==143){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: Hitler was HARANGUE in his speech, that is why he was able to sustain dictatorship for so long.");
        }
        else if(pos==144){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==145){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: Facebook after it's initial launch DISTENDED so rapidly that all other social networking sites almost vanished.");
        }
        else if(pos==146){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: John's father tried to CONDONE his habit of stealing and thus he became a prominent thief today.");
        }
        else if(pos==147){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: There should be no DISPARAGE between rich and poor people in society to avoid imbalance which may lead to riots.");
        }
        else if(pos==148){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: Video tutorials on a subject FACILITATE it's learning to a great extent.");
        }
        else if(pos==149){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: Despite being METICULOUS on the calm road, john was killed by a devastating crash at the highway.");
        }
        else if(pos==150){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: John was ICONOCLASTIC towards dowry and child mariage, and it was good for him.");
        }
        else if(pos==151){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: If there is acute PAUCITY of water then we have no other alternative accept to conserve water sources which are still present.");
        }
        else if(pos==152){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: Usama was REPROBATE after attacking World trade centre and pentagun, and hence he was killed by America.");
        }
        else if(pos==153){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: Some signs are just too TACIT to be uttered like the danger signal we see on the road-end.");
        }
        else if(pos==154){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: The solution proposed by john for the above problem was quite AMBIGUOUS and so was not accepted by his teacher.");
        }
        else if(pos==155){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: There are very less IDOLATRY persons left in our society .");
        }
        else if(pos==156){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: Due to the PRECIPITATE formation after the reaction, the teacher instructed the students to stop the reaction.");
        }
        else if(pos==157){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: The population of the white tiger is quite TENUOUS, so they are now meant to be preserved at once.");
        }
        else if(pos==158){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: The loss of the LOG files was a great loss for companies database center, since it was now not possible to review any event or changes.");
        }
        else if(pos==159){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: There are quite few people who have PROBITY in their attitude.");
        }
        else if(pos==160){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: Meera was too VERACIOUS in her attitude which had cost her a lot in a society of liars.");
        }
        else if(pos==161){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: The nut provided the best BOLSTER for the screws, but extra load given was not balanced and hence the system collasped.");
        }
        else if(pos==162){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: Telling lies often only EXACERBATES the situation .");
        }
        else if(pos==163){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: Generally in today's world, MAGNANIMITY is taken for granted and mis-used.");
        }
        else if(pos==164){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: John was having a PROFOUND secret about which he had not told even his parents as well.");
        }
        else if(pos==165){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: The gas was RAREFIED to great extent, but then also it caused the death of about 1000 people.");
        }
        else if(pos==166){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: String's are generally IMMUTABLE in java programming language.");
        }
        else if(pos==167){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: After being so ECLECTIC in his approach of choosing the vegetables, he was fooled by the shopkeeper.");
        }
        else if(pos==168){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: Girl's have generally more ALACRITY on their faces as compared to boys, it is scientifically proved.");
        }
        else if(pos==169){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: Ramayana and Mahabharata are VENERATED by almost everyone in India as well as abroad foreign countries.");
        }
        else if(pos==170){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==171){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==172){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==173){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==174){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==175){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==176){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==177){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==178){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==179){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==180){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==181){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==182){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==183){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==184){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==185){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==186){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==187){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==188){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==189){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==190){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==191){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==192){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==193){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==194){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");;
        }
        else if(pos==195){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==196){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==197){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==198){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==199){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==200){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==201){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==202){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==203){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==204){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==205){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==206){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==207){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==208){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==209){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==210){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==211){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==212){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==213){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==214){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==215){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==216){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==217){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==218){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==219){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==220){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==221){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==222){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==223){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==224){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==225){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==226){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==227){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==228){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==229){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==230){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==231){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==232){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==233){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==234){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==235){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==236){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==237){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==238){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==239){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==240){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==241){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==242){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==243){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==244){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==245){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==246){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==247){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==248){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==249){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==250){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==251){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==252){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==253){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==254){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==255){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==256){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==257){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==258){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==259){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==260){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==261){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==262){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==263){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==264){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==265){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==266){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==267){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==268){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==269){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==270){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==271){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==272){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==273){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==274){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==275){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==276){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==277){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==278){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==279){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==280){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==281){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==282){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==283){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==284){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==285){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==286){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==287){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==288){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==289){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==290){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==291){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==292){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==293){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==294){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==295){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==296){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==297){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==298){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==299){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==300){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==301){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==302){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==303){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==304){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==305){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==306){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==307){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==308){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==309){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==310){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==311){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==312){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==313){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==314){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==315){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==316){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==317){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==318){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==319){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==320){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==321){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==322){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==323){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==324){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==325){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==326){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==327){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==328){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==329){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==330){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==331){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==332){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==333){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==334){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==335){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==336){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==337){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==338){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==339){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==340){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==341){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==342){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==343){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==344){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==345){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==346){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==347){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==348){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==349){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==350){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==351){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==352){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==353){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==354){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==355){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==356){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==357){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==358){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==359){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==360){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==361){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==362){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==363){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==364){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==365){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==366){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==367){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==368){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==369){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==370){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==371){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==372){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==373){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==374){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==375){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==376){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==377){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==378){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==379){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==380){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==381){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==382){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==383){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==384){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==385){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==386){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==387){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==388){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==389){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==390){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==391){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==392){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==393){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==394){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==395){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==396){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==397){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==398){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==399){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==400){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==401){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==402){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==403){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==404){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==405){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==406){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==407){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==408){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==409){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==410){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==411){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==412){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==413){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==414){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==415){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==416){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==417){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==418){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }

        else if(pos==419){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==420){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==421){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==422){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==423){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==424){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==425){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==426){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==427){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==428){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }

        else if(pos==429){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==430){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==431){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==432){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==433){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==434){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==435){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==436){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==438){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==439){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==440){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==441){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==442){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==443){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==444){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==445){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==446){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==447){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==448){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==449){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==450){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==451){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==452){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==453){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==454){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==455){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==456){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==457){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==458){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==459){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }

        else if(pos==460){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==461){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==462){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==463){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==464){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==465){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==466){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==467){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==468){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==469) {
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==470){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==471){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==472){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==473){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==474){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==475){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==476){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==477){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==478){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==479){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }

        else if(pos==480){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==481){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==482){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==483){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==484){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==485){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==486){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==487){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==488){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==489){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }

        else if(pos==490){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==491){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==492){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==493){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==494){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==495){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==496){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==497){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==498){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }
        else if(pos==499){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }

        else if(pos==500){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(Top500wordslist.this, "EXAMPLE: ");
        }




        text.setText("You clicked " + selectedItem + " at position " + position);

    }



}
