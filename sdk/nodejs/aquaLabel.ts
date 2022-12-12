// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * The data source `aquasec.getAquaLabels` provides a method to query all aqua labels within the Aqua account management.The fields returned from this query are detailed in the Schema section below.
 */
export class AquaLabel extends pulumi.CustomResource {
    /**
     * Get an existing AquaLabel resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AquaLabelState, opts?: pulumi.CustomResourceOptions): AquaLabel {
        return new AquaLabel(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aquasec:index/aquaLabel:AquaLabel';

    /**
     * Returns true if the given object is an instance of AquaLabel.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AquaLabel {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AquaLabel.__pulumiType;
    }

    /**
     * The name of the user who created the Aqua label.
     */
    public /*out*/ readonly author!: pulumi.Output<string>;
    /**
     * The creation date of the Aqua label.
     */
    public /*out*/ readonly created!: pulumi.Output<string>;
    /**
     * Aqua label description.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Aqua label name.
     */
    public readonly name!: pulumi.Output<string>;

    /**
     * Create a AquaLabel resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: AquaLabelArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AquaLabelArgs | AquaLabelState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AquaLabelState | undefined;
            resourceInputs["author"] = state ? state.author : undefined;
            resourceInputs["created"] = state ? state.created : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
        } else {
            const args = argsOrState as AquaLabelArgs | undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["author"] = undefined /*out*/;
            resourceInputs["created"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AquaLabel.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AquaLabel resources.
 */
export interface AquaLabelState {
    /**
     * The name of the user who created the Aqua label.
     */
    author?: pulumi.Input<string>;
    /**
     * The creation date of the Aqua label.
     */
    created?: pulumi.Input<string>;
    /**
     * Aqua label description.
     */
    description?: pulumi.Input<string>;
    /**
     * Aqua label name.
     */
    name?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AquaLabel resource.
 */
export interface AquaLabelArgs {
    /**
     * Aqua label description.
     */
    description?: pulumi.Input<string>;
    /**
     * Aqua label name.
     */
    name?: pulumi.Input<string>;
}
